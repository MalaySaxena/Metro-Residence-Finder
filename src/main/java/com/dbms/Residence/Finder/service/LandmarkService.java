package com.dbms.Residence.Finder.service;

import com.dbms.Residence.Finder.models.Landmark;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.repository.LandmarkRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class LandmarkService {

    private LandmarkRepository landmarkRepository;

    private double calc_distance(double lat1, double lon1, double lat2, double lon2, char unit) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        if (unit == 'K') {
            dist = dist * 1.609344;
        } else if (unit == 'N') {
            dist = dist * 0.8684;
        }
        return (dist);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

    public List<Property> getNearProperty(Landmark landmark, List<Property> propertyList, int radius) {

        float landmarkLat = Float.parseFloat(landmark.getLatitude());
        float landmarkLong = Float.parseFloat(landmark.getLongitude());

        List<Property> filteredProperty  = new ArrayList<>();
        List<Integer>  distances = new ArrayList<>();

        for (Property property:propertyList){

            float propertyLat = Float.parseFloat(property.getLatitude());
            float propertyLong = Float.parseFloat(property.getLongitude());

            double distance = calc_distance(landmarkLat,landmarkLong,propertyLat,propertyLong,'K');

            if (distance <= radius){
                filteredProperty.add(property);
                distances.add((int)distance);
            }
        }
        filteredProperty.sort(Comparator.comparingInt(distances::indexOf));
        return filteredProperty;
    }

}

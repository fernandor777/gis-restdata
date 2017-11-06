/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmino.geo.restdata;

import java.io.Serializable;

/**
 *
 * @author Fernando
 */
public class Lonlat implements Serializable{
    
    private Double lat;
    private Double lon;

    public Lonlat() {
    }

    public Lonlat(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
    
    
    
}

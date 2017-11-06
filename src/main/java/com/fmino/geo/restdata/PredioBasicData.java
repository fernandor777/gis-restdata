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
public class PredioBasicData implements Serializable{
    
    private Long id;
    private Long numPredio;
    private String claveCatastral;

    public PredioBasicData() {
    }

    public PredioBasicData(Long id) {
        this.id = id;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumPredio() {
        return numPredio;
    }

    public void setNumPredio(Long numPredio) {
        this.numPredio = numPredio;
    }

    public String getClaveCatastral() {
        return claveCatastral;
    }

    public void setClaveCatastral(String claveCatastral) {
        this.claveCatastral = claveCatastral;
    }
    
    
    
    
    
    
}

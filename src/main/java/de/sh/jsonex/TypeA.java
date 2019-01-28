/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.sh.jsonex;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class TypeA extends Document {
    
    List<String> rawdata = new ArrayList<>();

    public List<String> getRawdata() {
        return rawdata;
    }

    public void setRawdata(List<String> rawdata) {
        this.rawdata = rawdata;
    }
    
    
    
}

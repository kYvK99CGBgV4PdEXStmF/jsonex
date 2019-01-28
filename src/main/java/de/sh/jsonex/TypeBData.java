/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.sh.jsonex;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class TypeBData {
    String v1;
    String v2;
    Integer v3;
    Map<String, String> map = new HashMap();

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }
    
    public Map getMap() {
        return map;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public Integer getV3() {
        return v3;
    }

    public void setV3(Integer v3) {
        this.v3 = v3;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
    
}

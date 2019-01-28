/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.sh.jsonex;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ReportTest {

    public ReportTest() {
    }

    /**
     * Test of getDocument method, of class Report.
     */
    @Test
    public void testGetDocument() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        Report r = new Report();

        TypeA typeA = new TypeA();
       
        typeA.rawdata = Arrays.asList("A", "B", "C");

        r.document.add(typeA);

        TypeB typeB = new TypeB();
       
        typeB.rawdata = new TypeBData();
        typeB.rawdata.v1 = "Steffi";
        typeB.rawdata.v2 = "Sussi";
        typeB.rawdata.v3 = 1000;
        typeB.rawdata.map.put("Herbert", "Grönemeyer");
        typeB.rawdata.map.put("100", "Göttingen");  
        typeB.rawdata.map.put("100", "6666.8908");

        r.document.add(typeB);

        TypeC typeC = new TypeC();
       
        typeC.rawdata = new TypeCData();
        typeC.rawdata.values = Arrays.asList(1, 2, 3, 4, 5);

        r.document.add(typeC);
        
        String s = null;
        try {
            s = mapper.writeValueAsString(r);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(s);

        Report c2 = null;
        try {
            c2 = mapper.readValue(s, Report.class);
        } catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

        if (c2 != null) {
            System.out.println("----- Items List -----");

            for (Document mi : c2.document) {
                String typeOfRawdata = "";
                if (mi instanceof TypeA) {
                    typeOfRawdata = ((TypeA) mi).getRawdata().getClass().toString();
                }
                if (mi instanceof TypeB) {
                    typeOfRawdata = ((TypeB) mi).getRawdata().getClass().toString();
                }
                if (mi instanceof TypeC) {
                    typeOfRawdata = ((TypeC) mi).getRawdata().getClass().toString();
                }
                System.out.println("Type = " + mi.getClass() + ", typeOfRawdata" + typeOfRawdata);
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.sh.jsonex;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 *
 * @author user
 */
@JsonTypeInfo(use = Id.NAME,
              include = JsonTypeInfo.As.PROPERTY,
              property = "type")
@JsonSubTypes({
    @Type(value = TypeA.class, name = "typeA"),
    @Type(value = TypeB.class, name = "typeB"),
    @Type(value = TypeC.class, name = "typeC"),
    })
public abstract class Document {
   
    Filename filename;

    

    public Filename getFilename() {
        return filename;
    }

    public void setFilename(Filename filename) {
        this.filename = filename;
    }
    
    
}

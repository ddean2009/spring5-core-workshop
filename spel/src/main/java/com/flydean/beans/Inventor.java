package com.flydean.beans;

import lombok.Data;

/**
 * @author wayne
 * @version Inventor,  2019-07-23 06:16
 */

@Data
public class Inventor {

    private String name;

    public Inventor(String nameA, String nameB) {
    }

    public Inventor() {

    }

    public Boolean isMember(String member){
        return true;
    }

    public void setPlaceOfBirth(PlaceOfBirth placeOfBirth){

    }
}

package com.flydean.beans;

import lombok.Data;

/**
 * @author wayne
 * @version ExoticType,  2019-07-20 10:03
 */

@Data
public class ExoticType {

    private String name;

    private Integer age;

    public ExoticType(String name) {
        this.name = name;
    }
}

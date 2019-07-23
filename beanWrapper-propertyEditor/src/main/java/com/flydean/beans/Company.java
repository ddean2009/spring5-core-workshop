package com.flydean.beans;

import lombok.Data;

/**
 * @author wayne
 * @version Company,  2019-07-20 09:08
 */

@Data
public class Company {

    private String name;
    private Employee managingDirector;
}
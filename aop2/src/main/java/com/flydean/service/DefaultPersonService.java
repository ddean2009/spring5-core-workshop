package com.flydean.service;

import com.flydean.beans.Person;

/**
 * @author wayne
 * @version DefaultPersonService,  2019-08-03 22:23
 */
public class DefaultPersonService implements PersonService {

    public Person getPerson(String name, int age) {
        return new Person(name, age);
    }
}
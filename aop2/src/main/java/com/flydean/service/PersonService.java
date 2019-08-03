package com.flydean.service;

import com.flydean.beans.Person;

/**
 * @author wayne
 * @version PersonService,  2019-08-03 22:22
 */
public interface PersonService {

    Person getPerson(String personName, int age);
}
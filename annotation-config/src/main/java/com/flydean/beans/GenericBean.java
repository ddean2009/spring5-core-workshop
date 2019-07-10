package com.flydean.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenericBean {

    @Autowired
    private Store<String> s1; // <String> qualifier, injects the stringStore bean

    @Autowired
    private Store<Integer> s2; // <Integer> qualifier, injects the integerStore bean

    // Inject all Store beans as long as they have an <Integer> generic
    // Store<String> beans will not appear in this list
    @Autowired
    private List<Store<Integer>> s;

}

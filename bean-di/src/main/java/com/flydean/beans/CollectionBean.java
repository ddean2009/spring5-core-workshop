package com.flydean.beans;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


@Data
public class CollectionBean {

    private List arrayList;

    private Set hashSet;

    private Map hashMap;

    private Properties properties;


}

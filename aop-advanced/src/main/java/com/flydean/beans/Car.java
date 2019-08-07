package com.flydean.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version Car,  2019-08-05 23:02
 */
@Configurable(preConstruction = true)
@Component
public class Car {
    @Autowired
    private Engine engine;
    @Autowired
    private Transmission transmission;

    public void startCar() {
        transmission.setGear(1);
        engine.engineOn();
        System.out.println("Car started");
    }
}
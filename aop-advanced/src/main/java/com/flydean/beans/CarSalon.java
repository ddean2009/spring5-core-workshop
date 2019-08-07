package com.flydean.beans;

import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version CarSalon,  2019-08-05 23:02
 */
@Component("carSalon")
public class CarSalon {
    //...
    public void testDrive() {
        Car car = new Car();
        car.startCar();
    }
}
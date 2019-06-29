package com.flydean.services;

public class DefaultServiceLocator {

    private static ServiceA serviceA = new ServiceA();

    private static ServiceB serviceB = new ServiceB();

    public ServiceA createServiceAInstance() {
        return serviceA;
    }

    public ServiceB createServiceBInstance() {
        return serviceB;
    }
}
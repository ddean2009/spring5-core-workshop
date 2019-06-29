package com.flydean.services;

public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    /**
     * 工厂方法，必须是静态方法
     * @return
     */
    public static ClientService createInstance() {
        return clientService;
    }
}
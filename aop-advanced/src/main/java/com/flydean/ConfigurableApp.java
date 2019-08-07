package com.flydean;

import com.flydean.beans.Account;
import com.flydean.beans.CarSalon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 * @version ConfigurableApp,  2019-08-04 23:26
 */

public class ConfigurableApp {

    private static Logger log= LoggerFactory.getLogger(ConfigurableApp.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-config.xml");
        CarSalon carSalon=(CarSalon) applicationContext.getBean("carSalon");
        carSalon.testDrive();

        Account accountA=new Account();
        log.info(accountA.getBeanA().toString());

    }
}


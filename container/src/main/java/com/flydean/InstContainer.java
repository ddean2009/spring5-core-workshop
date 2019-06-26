package com.flydean;

import com.flydean.daos.JpaAccountDao;
import com.flydean.services.PetStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class InstContainer {

    public static void main(String[] args) {

        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        // use configured instance
        List<String> userList = service.getUsernameList();

        //retrieve accountDao by Alias
        JpaAccountDao accountDao=(JpaAccountDao)context.getBean("accountDaoAlias");

    }
}

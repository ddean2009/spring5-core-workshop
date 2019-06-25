package com.flydean;

import com.flydean.services.PetStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import java.util.List;

public class InstContainerWithGroovy {

    public static void main(String[] args) {


        // create and configure beans with groovy
        //daos.groovy 必须写在services.groovy前面，否则会报bean找不到的错误
        ApplicationContext context = new GenericGroovyApplicationContext("daos.groovy","services.groovy");

        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        // use configured instance
        List<String> userList = service.getUsernameList();
    }
}

package com.flydean;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class InstContainerWithBeanDefinitionReader {

    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();
        //reader with xml
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml", "daos.xml");

        //reader with groovy
//        new GroovyBeanDefinitionReader(context).loadBeanDefinitions("daos.groovy","services.groovy");
        context.refresh();


    }
}

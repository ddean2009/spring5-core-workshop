package com.flydean;

import com.flydean.beans.Company;
import com.flydean.beans.Employee;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * @author wayne
 * @version BeanWrapperUsage,  2019-07-20 09:09
 */
public class BeanWrapperUsage {

    public static void main(String[] args) {
        BeanWrapper company = new BeanWrapperImpl(new Company());
        // setting the company name..
        company.setPropertyValue("name", "Some Company Inc.");
        // ... can also be done like this:
        PropertyValue value = new PropertyValue("name", "Some Company Inc.");
        company.setPropertyValue(value);

        // ok, let's create the director and tie it to the company:
        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name", "Jim Stravinsky");
        company.setPropertyValue("managingDirector", jim.getWrappedInstance());

        // retrieving the salary of the managingDirector through the company
        Float salary = (Float) company.getPropertyValue("managingDirector.salary");
    }
}

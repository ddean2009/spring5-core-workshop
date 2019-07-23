package com.flydean.beans;


import org.springframework.beans.factory.annotation.Value;

/**
 * @author wayne
 * @version FieldValueTestBean,  2019-07-21 17:29
 */
public class FieldValueTestBean {

        @Value("#{ systemProperties['user.region'] }")
        private String defaultLocale;

        public void setDefaultLocale(String defaultLocale) {
            this.defaultLocale = defaultLocale;
        }

        public String getDefaultLocale() {
            return this.defaultLocale;
        }

}
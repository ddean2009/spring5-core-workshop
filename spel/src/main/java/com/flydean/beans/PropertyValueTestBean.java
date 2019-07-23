package com.flydean.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author wayne
 * @version PropertyValueTestBean,  2019-07-21 17:32
 */
public  class PropertyValueTestBean {

        private String defaultLocale;

        @Value("#{ systemProperties['user.region'] }")
        public void setDefaultLocale(String defaultLocale) {
            this.defaultLocale = defaultLocale;
        }

        public String getDefaultLocale() {
            return this.defaultLocale;
        }

}

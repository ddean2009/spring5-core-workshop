package com.flydean.beans;

/**
 * @author wayne
 * @version Idempotent,  2019-08-03 20:48
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Idempotent {
        // marker annotation
        }

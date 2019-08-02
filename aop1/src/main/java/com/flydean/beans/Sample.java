package com.flydean.beans;

import java.util.Collection;

/**
 * @author wayne
 * @version Sample,  2019-08-02 22:05
 */
public interface Sample<T> {
    void sampleGenericMethod(T param);
    void sampleGenericCollectionMethod(Collection<T> param);
}
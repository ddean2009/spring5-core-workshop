package com.flydean.beans;

import java.beans.PropertyEditorSupport;

/**
 * @author wayne
 * @version ExoticTypeEditor,  2019-07-20 10:05
 */
public class ExoticTypeEditor extends PropertyEditorSupport {

    public void setAsText(String text) {
        setValue(new ExoticType(text.toUpperCase()));
    }
}

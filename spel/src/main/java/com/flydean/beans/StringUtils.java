package com.flydean.beans;

/**
 * @author wayne
 * @version StringUtils,  2019-07-23 06:49
 */
public abstract class StringUtils {

    public static String reverseString(String input) {
        StringBuilder backwards = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++)
            backwards.append(input.charAt(input.length() - 1 - i));
        return backwards.toString();
    }
}
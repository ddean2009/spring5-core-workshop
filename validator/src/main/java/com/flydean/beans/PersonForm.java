package com.flydean.beans;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author wayne
 * @version PersonForm,  2019-07-21 10:24
 */
@Data
public class PersonForm {

    @NotNull
    @Size(max=64)
    private String name;

    @Min(0)
    private int age;
}
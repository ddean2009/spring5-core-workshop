package com.flydean.beans;

import lombok.Data;

import java.util.Map;

@Data
public class Command {

    private Map state;

    public Object execute(){
        return null;
    }

}

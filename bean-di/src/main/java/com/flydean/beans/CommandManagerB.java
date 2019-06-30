package com.flydean.beans;

import java.util.Map;

public abstract class CommandManagerB {

    public Object process(Map commandState) {
        // grab a new instance of the appropriate Command interface
        AsyncCommand command = createCommand();
        return null;
    }

    // okay... but where is the implementation of this method?
    public abstract AsyncCommand createCommand();
}
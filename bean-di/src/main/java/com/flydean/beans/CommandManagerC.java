package com.flydean.beans;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class CommandManagerC {

    public Object process(Object commandState) {
        Command command = createCommand();
        return command.execute();
    }

    @Lookup("myCommand")
    protected abstract Command createCommand();
}

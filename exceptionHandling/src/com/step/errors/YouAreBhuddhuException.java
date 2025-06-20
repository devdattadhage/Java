package com.step.errors;

public class YouAreBhuddhuException extends Throwable {
    public YouAreBhuddhuException(String name, String msg) {
        super(name + " " + msg);
    }
}

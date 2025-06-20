package com.step.errors;

public class MarJaMitraException extends Throwable {
    public MarJaMitraException(String name, String msg) {
        super(name + " " + msg);
    }
}

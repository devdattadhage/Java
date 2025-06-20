package com.tw.step;

public class DataProcessor<T> {
    private final T t;

    public DataProcessor(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }
}

package com.example.todoApi.model;

public class Todo {
    private final int id;
    private final String title;
    private final String description;
    private final boolean done;

    public Todo(int id, String title, String description, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }
}

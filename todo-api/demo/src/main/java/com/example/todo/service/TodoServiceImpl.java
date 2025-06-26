package com.example.todo.service;

import com.example.todo.dto.CreateTodoRequest;
import com.example.todo.dto.TodoResponse;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{
    @Override
    public TodoResponse create(CreateTodoRequest request) {
        return new TodoResponse(1, request.getTitle(), request.getDescription(), false);
    }

    @Override
    public TodoResponse getById(int id) {
        return new TodoResponse(id, "Test Title", "Test Description", false);
    }
}

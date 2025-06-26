package com.example.todo.service;

import com.example.todo.dto.CreateTodoRequest;
import com.example.todo.dto.TodoResponse;

public interface TodoService {
    TodoResponse create(CreateTodoRequest request);
    TodoResponse getById(int id);
}

package com.example.todoApi.service;

import com.example.todoApi.dto.CreateTodoRequest;
import com.example.todoApi.dto.TodoResponse;

public interface TodoService {
    TodoResponse create(CreateTodoRequest request);
    TodoResponse getById(int id);
}

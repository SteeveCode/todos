package com.brexson.todos.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;
    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @GetMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("in28ms");
        model.addAttribute("todos", todos);

        return "listTodos";
    }

}
package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ToDoService;
import com.example.demo.model.Todo;
@RestController
@RequestMapping("/todos")
public class ToDoRestController 
{
	 
			private ToDoService toDoService;
			@Autowired
			public ToDoRestController(ToDoService toDoService) {
				super();
				this.toDoService = toDoService;
			}

			@GetMapping("/")
			public List<Todo> getAllToDos()
			{
				return toDoService.getAllToDos();
			}

		}


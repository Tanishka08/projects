package com.example.demo.Dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;

import java.util.ArrayList;
@Repository
public class ToDoDaoImpl implements TodoDao
{
private List<Todo> toDoList;
{
	
		toDoList=new ArrayList<Todo>();
		toDoList.add(new Todo("t1", "test todo-1"));
		toDoList.add(new Todo("t2", "test todo-2"));
		toDoList.add(new Todo("t3", "test todo-3"));
		toDoList.add(new Todo("t4", "test todo-4"));
		toDoList.add(new Todo("t5", "test todo-5"));
	}

	public List<Todo> getAllToDos() {
		
		return toDoList;
	}

}



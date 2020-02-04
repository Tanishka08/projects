package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TodoDao;
import com.example.demo.model.Todo;
@Service
public class ToDoServiceImpl implements ToDoService
{

		private TodoDao toDoDao;
		
		@Autowired
		public ToDoServiceImpl(TodoDao toDoDao) {
			super();
			this.toDoDao = toDoDao;
		}
		

@Override
		public List<Todo> getAllToDos()
{
	return toDoDao.getAllToDos();
		}

	}	



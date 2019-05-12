package com.main.dateapp_main.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todo = new ArrayList<Todo>();
	private static int idCounter = 0;
	
	static {
		todo.add(new Todo(++idCounter,"Bhaskar","SomeThing1",new Date(),false));
		todo.add(new Todo(++idCounter,"Bhaskar","SomeThing2",new Date(),false));
		todo.add(new Todo(++idCounter,"Bhaskar","SomeThing3",new Date(),false));
	}
	
	public List<Todo> getTodos(){
		return todo;
	}
}

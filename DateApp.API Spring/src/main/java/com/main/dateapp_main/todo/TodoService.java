package com.main.dateapp_main.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "Bhaskar", "SomeThing1", new Date(), false));
		todos.add(new Todo(++idCounter, "Bhaskar", "SomeThing2", new Date(), false));
		todos.add(new Todo(++idCounter, "Bhaskar", "SomeThing3", new Date(), false));
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public Todo deleteById(long id) {
		Todo todo = findTodoById(id);
		if (todos.remove(todo)) {
			return todo;
		}
		return null;

	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		
		return todo;
	}

	public Todo findTodoById(long id) {
		for (Todo todo : todos) {

			if (todo.getId() == id) {
				return todo;
			}
//			return null;

		}
		return null;
	}
}

package com.main.dateapp_main.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class TodoResourse {
	
	@Autowired
	public TodoService todoService;
	
	@GetMapping("/user/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		System.out.println(username);
		return todoService.getTodos();
	}
	
	@GetMapping("/user/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username,@PathVariable long id){
		System.out.println(id);
		return todoService.findTodoById(id);
	}
	
	
	@PutMapping("/user/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username,@PathVariable long id,@RequestBody Todo todo){
		System.out.println(id);
		Todo todoUpdate = todoService.save(todo);
		return new ResponseEntity<Todo>(todo,HttpStatus.OK);
	}

	
	
	@DeleteMapping("/user/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username,@PathVariable long id){
		System.out.println(id);
		Todo todo = todoService.deleteById(id);
		if(todo != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
	

}

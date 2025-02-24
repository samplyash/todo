package com.todo.todo.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService =taskService;
	}
	
	public String getTasks() {
		List<Task> tasks = taskService.getAllTask();
	}

	
	
}

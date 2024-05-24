package com.lacerda.toDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lacerda.toDoList.model.Tasks;
import com.lacerda.toDoList.service.TasksService;

@RestController
@RequestMapping("/tasks")
public class TasksController {

	@Autowired
	TasksService taksService;


	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tasks> findAll() {
		return taksService.findAll();
	}

	@PostMapping
	public Tasks crate(@RequestBody Tasks tasks) {

		List<Tasks> ListTasks = findAll();

				
		return tasks;
	}
}

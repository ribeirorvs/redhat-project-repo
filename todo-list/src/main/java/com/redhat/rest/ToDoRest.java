package com.redhat.rest;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.controller.TaskController;
import com.redhat.controller.ToDoController;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ToDoRest {
	ToDoController todoList = new ToDoController();
	
	@POST
	@Path("/add")
	public void addTask(@FormParam("task-title") String title, 
						@FormParam("task-desc") String desc,
						@FormParam("task-startDay") LocalDate startDay, 
						@FormParam("task-startTime") LocalTime startTime,
						@FormParam("task-lastDay") LocalDate lastDay,
						@FormParam("task-lastTime") LocalTime lastTime) {
		
		TaskController task = new TaskController(startDay, 
												lastDay, 
												startTime, 
												lastTime, 
												title, 
												desc);
		todoList.addTask(task);
	}
	
	@GET
	@Path("/check")
	public String checkTask(@FormParam("task-id") int id) {
		TaskController t = todoList.checkTask(id);
		return t.toString();
	}
	
	
	
	@GET
	@Path("/list")
	public String listTasks() {
		List<TaskController> tasks = todoList.getTasks();
		return tasks.toString();
	}
	
}

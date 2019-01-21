package com.redhat.rest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.inject.Inject;
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
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public class ToDoRest {
	
	@Inject
	private ToDoController todoList;
	
	@POST
	@Path("/add")
	public String addTask(@FormParam("task-title") String title, 
						@FormParam("task-desc") String desc,
						@FormParam("task-startDay") String startDay, 
						@FormParam("task-lastDay") String finalDay
						) {
		LocalDate firstDay = LocalDate.parse(startDay);
		LocalDate lastDay = LocalDate.parse(finalDay);
		LocalTime firstTime = LocalTime.parse("11:11");
		LocalTime lastTime = LocalTime.parse("11:11");
		TaskController task = new TaskController(firstDay, 
												lastDay, 
												firstTime, 
												lastTime, 
												title, 
												desc);
		todoList.addTask(task);
		System.out.println("ToDo List now: " + todoList.toString() );
		return "ok";
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
		System.out.println(todoList.toString());
		return tasks.toString();
	}
	
}

package com.redhat.rest;

import java.net.URI;
import java.net.URISyntaxException;
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
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.redhat.controller.TaskController;
import com.redhat.controller.ToDoController;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public class ToDoRest {
	
	private ToDoController todoList = new ToDoController();
	
	@POST
	@Path("/add")
	public Response addTask(@FormParam("task-title") String title, 
						@FormParam("task-desc") String desc,
						@FormParam("task-startDay") String startDay, 
						@FormParam("task-startTime") String startTime,
						@FormParam("task-lastDay") String finalDay,
						@FormParam("task-lastTime") String finalTime) {
		LocalDate firstDay = LocalDate.parse(startDay);
		LocalDate lastDay = LocalDate.parse(finalDay);
		LocalTime firstTime = LocalTime.parse(startTime);
		LocalTime lastTime = LocalTime.parse(finalTime);
		TaskController task = new TaskController(firstDay, 
												lastDay, 
												firstTime, 
												lastTime, 
												title, 
												desc);
		todoList.addTask(task);
		ResponseBuilder builder = null;
		
		try {
			builder = Response.seeOther(new URI("../"));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return builder.build();
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
		System.out.println("Ok K.O.");
		return tasks.toString();
	}
	
}

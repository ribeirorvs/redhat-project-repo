package com.redhat.rest;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	public void addTask() {
		try {
			todoList.addTask();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GET
	@Path("/check/{id}")
	public String checkTask(@PathParam("id") int id) {
		try {
			TaskController t = todoList.checkTask();
			return t.toString();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	@GET
	@Path("/list")
	public String listTasks() {
		List<TaskController> tasks = todoList.getTasks();
		return tasks.toString();
	}
	
}

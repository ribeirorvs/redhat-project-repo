/**
 * 
 */
package com.redhat.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.redhat.model.Task;

/**
 * @author roribeir
 *
 */
public class TaskServeletController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	//Method used to create new Tasks using the parameter of the request	
	private Task createTask(HttpServletRequest request) {
		int id;
		LocalDate startDay = LocalDate.parse(request.getParameter("task-starDay"));
		LocalDate finalDay = LocalDate.parse(request.getParameter("task-tinalDay"));
		LocalTime startTime = LocalTime.parse(request.getParameter("task-startTime"));
		LocalTime finalTime = LocalTime.parse(request.getParameter("task-finalTime"));
		String title = request.getParameter("task-title");
		String description = "";
		if(request.getParameter("task-desc") != null) 
			description = request.getParameter("task-desc");
		
		Task task = new Task(startDay, finalDay, startTime, 
				finalTime, title, description);
		return task;
	}
	
	//Create a List of Task to maintain all tasks created
	//this List will be put in an attribute
	private List<Task> createListTasks(Task task){
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(task);
		return tasks;
	}
	
	//Get the Task List from the attribute
	private List<Task> getTasks(HttpServletRequest request){
		List<Task> tasks = new ArrayList<Task>();
		tasks = (List) request.getAttribute("tasks");
		return tasks;
	}
	
}

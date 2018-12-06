package com.redhat.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.redhat.model.Task;
import com.redhat.model.ToDo;

public class ToDoController {
	
	private List<TaskController> tasks = new ArrayList<TaskController>();
	
	public ToDoController() {}
	
	public ToDoController(ToDo todo) {
		for (Task task : todo.getTasks()) {
			this.tasks.add(new TaskController(task));
		}
	}
	
	public List<TaskController> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskController> tasks) {
		this.tasks = tasks;
	}
	
	public void addTask(TaskController task) {
		this.tasks.add(task);
	}
	
	public void addTask() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TaskController task = new TaskController();
		System.out.print("Title of the task: ");
		task.setTitle(reader.readLine());
		System.out.print("Start day (yyyy-MM-dd): ");
		task.setStartDay(LocalDate.parse(reader.readLine()));
		System.out.print("Start time (HH:mm:ss): ");
		task.setStartTime(LocalTime.parse(reader.readLine()));
		System.out.print("End day (yyyy-MM-dd): ");
		task.setFinalDay(LocalDate.parse(reader.readLine()));
		System.out.print("End time (HH:mm:ss): ");
		task.setFinalTime(LocalTime.parse(reader.readLine()));
		System.out.print("Description : ");
		task.setDescription(reader.readLine());
		addTask(task);
	}
	
	public TaskController checkTask(int id){
		for (TaskController task : tasks) {
			if(task.getId() == id) {
				return task;
			}
		}
		return null;
	}
	
	public void removeTask(TaskController task) {
		this.tasks.remove(task);
	}
	
	public void removeTask(int id){
		TaskController task = this.checkTask(id);
		this.removeTask(task);
	}
	
	public void clearToDo() {
		this.tasks.clear();
	}
	
	@Override
	public String toString() {
		String todo = "ToDoController {\n";
		for (TaskController task : tasks) {
			todo = todo.concat(task.toString() + "\n");
		}
		todo = todo.concat("}");
		return todo;
	}
	
	public ToDo toTodo() {
		List<Task> task = new ArrayList<Task>();
		for (TaskController taskController : this.tasks) {
			task.add(taskController.toTask());
		}
		ToDo todo = new ToDo(task);
		return todo;
	}
}

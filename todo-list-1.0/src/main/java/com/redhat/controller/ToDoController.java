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
	
	private List<Task> tasks = new ArrayList<Task>();
	
	public ToDoController() {}
	
	public ToDoController(ToDo todo) {
		this.tasks = todo.getTasks();
	}
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public void addTask(Task task) {
		this.tasks.add(task);
	}
	
	public void addTask() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Task task = new Task();
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
	
	public void listTasks() {
		
	}
	
	public Task checkTask() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Informe the task id: ");
		int id = Integer.parseInt(reader.readLine());
		for (Task task : tasks) {
			if(task.getId() == id) {
				return task;
			}
		}
		return null;
	}
	
	public void removeTask(Task task) {
		this.tasks.remove(task);
	}
	
	public void removeTask() throws NumberFormatException, IOException {
		Task task = this.checkTask();
		this.removeTask(task);
	}
	
	public void clearToDo() {
		this.tasks.clear();
	}
	
	@Override
	public String toString() {
		String todo = "ToDoController {\n";
		for (Task task : tasks) {
			todo = todo.concat(task.toString() + "\n");
		}
		todo = todo.concat("}");
		return todo;
	}
	
	public ToDo toTodo() {
		ToDo todo = new ToDo(this.tasks);
		return todo;
	}
}

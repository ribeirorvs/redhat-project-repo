/**
 * 
 */

package com.redhat.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version		1.0
 * @author 		Rodrigo Vitor Ribeiro
 */

public class ToDo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Task> tasks = new ArrayList<Task>();

	public ToDo() {}
	
	public ToDo(List<Task> tasks) {
		this.tasks = tasks;
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
	
	public void removeTask(Task task) {
		this.tasks.remove(task);
	}
	
	public void clearToDo() {
		this.tasks.clear();
	}
	
	@Override
	public String toString() {
		String todo = "ToDo {\n";
		for (Task task : tasks) {
			todo = todo.concat(task.toString() + "\n");
		}
		todo = todo.concat("}");
		return todo;
	}
}

package com.redhat.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import com.redhat.model.Task;

public class TaskController {
	
	private static int total = 0;
	
	private int id;
	private LocalDate startDay, finalDay;
	private LocalTime startTime, finalTime;
	private String title;
	private String description;
	
	
	public TaskController() {
		this.id = total;
		total++;
	}
	
	public TaskController(Task task) {
		this(task.getStartDay(), task.getFinalDay(), task.getStartTime(),
				task.getFinalTime(), task.getTitle(), task.getDescription());
	}
	

	public TaskController(LocalDate startDay, LocalDate finalDay, LocalTime startTime, 
			LocalTime finalTime, String title, String description) {
		this();
		this.startDay = startDay;
		this.finalDay = finalDay;
		this.startTime = startTime;
		this.finalTime = finalTime;
		this.title = title;
		this.description = description;
	}

	public LocalDate getStartDay() {
		return startDay;
	}

	public void setStartDay(LocalDate startDay) {
		this.startDay = startDay;
	}

	public LocalDate getFinalDay() {
		return finalDay;
	}

	public void setFinalDay(LocalDate finalDay) {
		this.finalDay = finalDay;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(LocalTime finalTime) {
		this.finalTime = finalTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Task [Id=" + id + ", titile=" + this.title + ", From=" + this.startDay + 
				" " + this.startTime + ", to=" + this.finalDay + " " + 
				this.finalTime + ", description=" + this.description + "]\n";
	}
	
	public Task toTask(){
		Task t = new Task(this.startDay, this.finalDay, this.startTime, 
				this.finalTime, this.title, this.description);
		t.setId(this.getId());
		return t;
	}
}

package com.redhat.controller;


import com.redhat.model.Task;

public class TaskController {
	
	private static int total = 0;
	
	private int id;
	private String startDay, finalDay;
	private String startTime, finalTime;
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
	

	public TaskController(String startDay, String finalDay, String startTime, 
			String finalTime, String title, String description) {
		this();
		this.startDay = startDay;
		this.finalDay = finalDay;
		this.startTime = startTime;
		this.finalTime = finalTime;
		this.title = title;
		this.description = description;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getFinalDay() {
		return finalDay;
	}

	public void setFinalDay(String finalDay) {
		this.finalDay = finalDay;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(String finalTime) {
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

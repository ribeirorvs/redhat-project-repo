package com.redhat.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static int total = 0;
	
	private int id;
	private String startDay, finalDay;
	private String startTime, finalTime;
	private String title;
	private String description;
	
	
	public Task() {
		this.id = total;
		total++;
	}
	
	public Task(String startDay, String finalDay, String startTime, 
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
				this.finalTime + ", description=" + this.description + "]";
	}
	
}

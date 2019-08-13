/**
 * 
 */

package com.redhat.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @version		1.0
 * @author		Rodrigo Vitor Ribeiro
 */

public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static int total = 0;
	
	private int id;
	private LocalDate startDay, finalDay;
	private LocalTime startTime, finalTime;
	private String title;
	private String description;
	
	
	public Task() {
		this.id = total;
		total++;
	}
	
	public Task(LocalDate startDay, LocalDate finalDay, LocalTime startTime, 
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
				this.finalTime + ", description=" + this.description + "]";
	}
	
}

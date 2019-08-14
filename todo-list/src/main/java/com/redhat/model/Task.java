package com.redhat.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @version 1.0
 * @author Rodrigo Vitor Ribeiro
 */
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;
    private static int total = 0;
    private int id;
    private LocalDate startDay, finalDay;
    private LocalTime startTime, finalTime;
    private String title;
    private String description;

    /**
     * Default constructor.
     */
    public Task() {
        this.id = total;
        total++;
    }

    /**
     * Constructor that receive all attributes of the class.
     *
     * @param startDayVal The start day of the task,
     * need to be => to actual date
     * @param finalDayVal The final day of the task need to be => to startDay
     * @param startTimeVal The start time of the task,
     * need to be > to actual time
     * @param finalTimeVal If the finalDay is the same as startDay,
     * this need to be > then startTime
     * @param titleVal The title of the task
     * @param descriptionVal The description of the task, it can be null
     */
    public Task(final LocalDate startDayVal,
                final LocalDate finalDayVal,
                final LocalTime startTimeVal,
                final LocalTime finalTimeVal,
                final String titleVal,
                final String descriptionVal) {
        this();
        this.startDay = startDayVal;
        this.finalDay = finalDayVal;
        this.startTime = startTimeVal;
        this.finalTime = finalTimeVal;
        this.title = titleVal;
        this.description = descriptionVal;
    }

    /**
     * This method return only the start day of the task.
     *
     * @return Return a LocalDate refer to start day of the task
     * @see LocalDate
     */
    public LocalDate getStartDay() {
        return startDay;
    }

    /**
     * This method change the start day of the task.
     *
     * @param newStartDay A LocalDate object that,
     * will be the new start day of the task
     * @see LocalDate
     */
    public void setStartDay(final LocalDate newStartDay) {
        this.startDay = newStartDay;
    }

    /**
     * This method return only the final day of the task.
     *
     * @return Return a LocalDate refer to final day of the task
     * @see LocalDate
     */
    public LocalDate getFinalDay() {
        return finalDay;
    }

    /**
     * This method set a new final date to the task.
     *
     * @param newFinalDay A LocalDate that will be the
     * new final date of the task
     * @see LocalDate
     */
    public void setFinalDay(final LocalDate newFinalDay) {
        this.finalDay = newFinalDay;
    }

    /**
     * This method return the start time of the task.
     *
     * @return Return a LocalTime that represent the start time of the task.
     * @see LocalTime
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * This method set a new start time to the task.
     *
     * @param newStartTime A LocalTime that will be the
     * new start time of the task.
     * @see LocalTime
     */
    public void setStartTime(final LocalTime newStartTime) {
        this.startTime = newStartTime;
    }

    /**
     * This method return the final time of the task.
     *
     * @return Return a LocalTime that represent the final time of the task.
     * @see LocalTime
     */
    public LocalTime getFinalTime() {
        return finalTime;
    }

    /**
     * This method set a new final time to the task.
     *
     * @param newFinalTime A LocalTime that will be the
     * new final time of the task.
     * @see LocalTime
     */
    public void setFinalTime(final LocalTime newFinalTime) {
        this.finalTime = newFinalTime;
    }

    /**
     * This method return the task title.
     *
     * @return Return a task title in a String
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method set a new task title.
     *
     * @param newTitle A String that will be the new task title.
     */
    public void setTitle(final String newTitle) {
        this.title = newTitle;
    }

    /**
     * This method return the task description.
     *
     * @return Return the task description like a String
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method set a new task description.
     *
     * @param newDescription A String that will be the new task description
     */
    public void setDescription(final String newDescription) {
        this.description = newDescription;
    }

    /**
     * This method return the ID of the task.
     *
     * @return Return a task id like a int
     */
    public int getId() {
        return id;
    }

    /**
     * This method set a new task ID.
     * <p>
     * Use this method with careful, it don't have a validation.
     *
     * @param newId A int that will be the new task ID
     */
    public void setId(final int newId) {
        this.id = newId;
    }

    /**
     * This method override the default toString method
     * to return a more useful string about the class.
     */
    @Override
    public String toString() {
        return "Task [Id=" + id
                + ", titile=" + this.title
                + ", From=" + this.startDay + " " + this.startTime
                + ", to=" + this.finalDay + " " + this.finalTime
                + ", description=" + this.description + "]";
    }
}

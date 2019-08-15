package com.redhat.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import com.redhat.model.Task;

/**
 * @version 2.5 13 Aug 2019
 * @author Rodrigo Vitor Ribeiro
 */

public class TaskController {

    private static int total = 0;
    private int id;
    private LocalDate startDay, finalDay;
    private LocalTime startTime, finalTime;
    private String title;
    private String description;

    /**
     * Default constructor.
     */
    public TaskController() {
        this.id = total;
        total++;
    }

    /**
     * Constructor that receive a task to initialize the object.
     *
     * @param task A Task obeject to initialize the task controller
     * @see Task
     */
    public TaskController(final Task task) {
        this(task.getStartDay(), task.getFinalDay(), task.getStartTime(),
                task.getFinalTime(), task.getTitle(), task.getDescription());
    }

    /**
     * A constructor that receive information to create a task and
     * initialize this object.
     *
     * @param startDayVal The start day of the task
     * @param finalDayVal The final day of the task
     * @param startTimeVal The start time of the task
     * @param finalTimeVal The final time of the task
     * @param titleVal The title of the task
     * @param descriptionVal the description of the task, cab be null
     * @see Task
     * @see LocalDate
     * @see LocalTime
     */
    public TaskController(final LocalDate startDayVal,
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
     * This method return the start day of the task.
     *
     * @return Return a LocalDate object
     * @see LocalDate
     */
    public LocalDate getStartDay() {
        return startDay;
    }

    /**
     * This metod set a new value for the task start day.
     *
     * @param newStartDay A LocalDate object
     * @see LocalDate
     */
    public void setStartDay(final LocalDate newStartDay) {
        this.startDay = newStartDay;
    }

    /**
     * This method return a final date of the task.
     *
     * @return Return a LocalDate object
     * @see LocalDate
     */
    public LocalDate getFinalDay() {
        return finalDay;
    }

    /**
     * This method set a new final date of the task.
     *
     * @param newFinalDay A LocalDate object
     * @see LocalDate
     */
    public void setFinalDay(final LocalDate newFinalDay) {
        this.finalDay = newFinalDay;
    }

    /**
     * This method return the star time of the task.
     *
     * @return Return a LocalTime object
     * @see LocalTime
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * This method set a new start time to the task.
     *
     * @param newStartTime Return a LocalTime object
     * @see LocalTime
     */
    public void setStartTime(final LocalTime newStartTime) {
        this.startTime = newStartTime;
    }

    /**
     * This method return the final time of the task.
     *
     * @return Return a LocalTime object
     * @see LocalTime
     */
    public LocalTime getFinalTime() {
        return finalTime;
    }

    /**
     * This method set a new final date to the task.
     *
     * @param newFinalTime Return a LocalTime object
     * @see LocalTime
     */
    public void setFinalTime(final LocalTime newFinalTime) {
        this.finalTime = newFinalTime;
    }

    /**
     * This method return the task title.
     *
     * @return Return a String object
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method set a new task title.
     *
     * @param newTitle A String object
     */
    public void setTitle(final String newTitle) {
        this.title = newTitle;
    }

    /**
     * This method return the task description.
     *
     * @return Return a String object
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method set a new task description.
     *
     * @param newDescription A String object
     */
    public void setDescription(final String newDescription) {
        this.description = newDescription;
    }

    /**
     * This method return the task ID.
     *
     * @return Return a int value
     */
    public int getId() {
        return id;
    }

    /**
     * This method set a new ID to the task.
     * <p>
     * Use this method with careful, because the method don't
     * have any validation if the ID is in use.
     *
     * @param newId A int value
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
                + ", description=" + this.description
                + "]\n";
    }

    /**
     * This method convert the object TaskController in a Task object.
     * <p>
     * This is useful in moments that you need to have a
     * simple Task object
     *
     * @return Return a Task object
     * @see Task
     */
    public Task toTask() {
        Task t = new Task(this.startDay, this.finalDay, this.startTime,
                this.finalTime, this.title, this.description);
        t.setId(this.getId());
        return t;
    }
}

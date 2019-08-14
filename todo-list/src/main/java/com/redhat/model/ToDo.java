/**
 *
 */
package com.redhat.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author Rodrigo Vitor Ribeiro
 */
public class ToDo implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Task> tasks = new ArrayList<Task>();

    /**
     * Default constructor.
     */
    public ToDo() { }

    /**
     * Constructor that initiate the class with a list
     * of Tasks objects.
     *
     * @param taskList A List of Task objects.
     * @see List
     * @see Task
     */
    public ToDo(final List<Task> taskList) {
        this.tasks.addAll(taskList);
    }

    /**
     * This method return a List with all Task objects
     * that the TO DO list has.
     *
     * @return Return a List of Task
     * @see List
     * @see Task
     */
    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * This method change the whole Task list
     * of the TO DO list.
     *
     * @param taskList The new List of Task
     * @see List
     * @see Task
     */
    public void setTasks(final List<Task> taskList) {
        this.tasks.clear();
        this.tasks.addAll(taskList);
    }

    /**
     * This method include a new Task in the list of tasks.
     *
     * @param newTask A Task object to be included in the list.
     * @see Task
     */
    public void addTask(final Task newTask) {
        this.tasks.add(newTask);
    }

    /**
     * This method remove a Task from the list of tasks.
     *
     * @param task A Task to be removed from the list
     * @see Task
     */
    public void removeTask(final Task task) {
        this.tasks.remove(task);
    }

    /**
     * This method remove the whole tasks from the list of tasks.
     */
    public void clearToDo() {
        this.tasks.clear();
    }

    /**
     * This method override the default toString method
     * to return a more useful string about the class.
     */
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

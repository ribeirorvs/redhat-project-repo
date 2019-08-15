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

/**
 * @version 2.0
 * @author Rodrigo Vitor Ribeiro
 */
public class ToDoController {

    private List<TaskController> tasks = new ArrayList<TaskController>();

    /**
     * Default constructor.
     */
    public ToDoController() { }

    /**
     * This constructor receive a ToDo object
     * to instantiate the internal task list.
     *
     * @param todo A ToDo object with tasks
     * @see ToDo
     */
    public ToDoController(final ToDo todo) {
        for (Task task : todo.getTasks()) {
            this.tasks.add(new TaskController(task));
        }
    }

    /**
     * This method return all tasks in a list object.
     *
     * @return Return a List of TaskController
     * @see List
     * @see TaskController
     */
    public List<TaskController> getTasks() {
        return tasks;
    }

    /**
     * This method change the whole list of tasks.
     *
     * @param newTasks A List of TaskController to be the new
     * task list
     */
    public void setTasks(final List<TaskController> newTasks) {
        this.clearToDo();
        this.tasks.addAll(newTasks);
    }

    /**
     * This method include a new task in the list of tasks.
     *
     * @param newTask A TaskController to be included in the list of tasks.
     * @see TaskController
     */
    public void addTask(final TaskController newTask) {
        this.tasks.add(newTask);
    }

    /**
     * The method addTask are created to support non GUI application.
     * Method related with console application version see
     * the com.redhat.view.Main class
     *
     * @throws IOException Throws error of IO
     */
    public void addTask() throws IOException {
        BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(System.in));
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

    /**
     * This method check if the list have a task and return it.
     *
     * @param id A int value related to the task ID
     * @return Return a TaskController if the task exist in the list
     * or null
     * @see TaskController
     */
    public TaskController checkTask(final int id) {
        for (TaskController task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    /**
     * This method remove a task from the list.
     * <p>
     * This is an auxiliary method, the validation to check
     * if the task exists in the list need to be done before
     * call this method
     *
     * @param task A TaskController that will be remove from the list.
     * @see TaskController
     */
    private void removeTask(final TaskController task) {
        this.tasks.remove(task);
    }

    /**
     * This method remove a task from the list.
     * <p>
     * This task have a check before remove the task
     *
     * @param id A int related to task id that will be removed
     */
    public void removeTask(final int id) {
        TaskController task = this.checkTask(id);
        if (task != null) {
            this.removeTask(task);
        }
    }

    /**
     * This method remove all tasks from the list of tasks.
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
        String todo = "ToDoController {\n";
        for (TaskController task : tasks) {
            todo = todo.concat(task.toString() + "\n");
        }
        todo = todo.concat("}");
        return todo;
    }

    /**
     * This method convert the object ToDoController in a ToDo object.
     * <p>
     * This is useful in moments that you need to have a
     * simple ToDo object
     *
     * @return Return a ToDo object with a list of Task objects
     * @see ToDo
     * @see Task
     */
    public ToDo toTodo() {
        List<Task> task = new ArrayList<Task>();
        for (TaskController taskController : this.tasks) {
            task.add(taskController.toTask());
        }
        ToDo todo = new ToDo(task);
        return todo;
    }
}

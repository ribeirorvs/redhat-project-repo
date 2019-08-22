/**
 *
 */

package com.redhat.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import com.redhat.controller.TaskController;
import com.redhat.controller.ToDoController;

/**
 * @version 2.0
 * @author Rodrigo Vitor Ribeiro
 */
@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public class ToDoRest {

    /**
     *
     */
    private ToDoController todoList = new ToDoController();

    /**
     * This method is responsible for insert a new task in the
     * TO DO task list.
     * <p>
     * This method are functional, but don't return nothing.
     *
     * @param title The title of the new task
     * @param desc The description of the new task, it can be null
     * @param startDay The start day of the task, need to be => to actual date
     * @param startTime The start time of the task need to be > to actual time
     * @param finalDay The final day of the task need to be => to startDay
     * @param finalTime If the finalDay is the same as startDay,
     * this need to be > then startTime
     * @return return the process to index.jsp
     * @see Response
     */
    @POST
    @Path("/add")
    public Response addTask(@FormParam("task-title") final String title,
            @FormParam("task-desc") final String desc,
            @FormParam("task-startDay") final String startDay,
            @FormParam("task-startTime") final String startTime,
            @FormParam("task-lastDay") final String finalDay,
            @FormParam("task-lastTime") final String finalTime) {
        LocalDate firstDay = LocalDate.parse(startDay);
        LocalDate lastDay = LocalDate.parse(finalDay);
        LocalTime firstTime = LocalTime.parse(startTime);
        LocalTime lastTime = LocalTime.parse(finalTime);
        TaskController task = new TaskController(firstDay,
                lastDay,
                firstTime,
                lastTime,
                title,
                desc);
        todoList.addTask(task);
        //ResponseBuilder builder = null;

        try {
            ResponseBuilder builder = Response.seeOther(new URI("../"));
            return builder.build();
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    /**
     * This method return all informations about one task
     * from TO DO list.
     * <p>
     * This method are functional, but return only a string
     *
     * @param id The id of the task will be returned
     * @return return the task in a string
     */
    @GET
    @Path("/check")
    public String checkTask(@FormParam("task-id") final int id) {
        TaskController t = todoList.checkTask(id);
        return t.toString();
    }

    /**
     * This method return all informations about the
     * whole list of tasks in TO DO list.
     * <p>
     * This method are functional, but return only a string
     *
     * @return return a string with the informations of all tasks
     */
    @GET
    @Path("/list")
    public String listTasks() {
        List<TaskController> tasks = todoList.getTasks();
        System.out.println(todoList.toString());
        System.out.println("Ok K.O.");
        return tasks.toString();
    }

}

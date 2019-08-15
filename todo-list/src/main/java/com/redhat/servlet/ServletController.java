package com.redhat.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.redhat.controller.TaskController;
import com.redhat.controller.ToDoController;

/**
 * @version 2.5 13 Aug 2019
 * @author Rodrigo Vitor Ribeiro
 */
public class ServletController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private ToDoController td = new ToDoController();

    /**
     * The doPost method that controlle what the servlet will do.
     * @param request A request with the parameters what
     * will used to add the task.
     * @param response A response that can be used to return the method result,
     * but is not used in this case.
     * @throws ServletException Return error from servlet
     * @throws IOException Return error from IO
     * @see HttpServletRequest
     * @see HttpServletResponse
     */
    public void doPost(final HttpServletRequest request,
                        final HttpServletResponse response)
                                throws ServletException, IOException {
        switch (request.getParameter("operation")) {
        case "addTask":
            addTask(request, response, td);
            break;
        case "listTasks":
            listTasks(request, response, td);
            break;
        case "checkTask":
            checkTask(request, response, td);
            break;
        default:
            break;
        }

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }

    /**
     * This method use the ToDoController to add a new task to TO DO list.
     *
     * @param request A request with the parameters what
     * will used to add the task.
     * @param response A response that can be used to return the method result,
     * but is not used in this case.
     * @param tmpTd The ToDoController that will be
     * responsible for add the task.
     * @see HttpServletRequest
     * @see HttpServletResponse
     * @see ToDoController
     */
    private void addTask(final HttpServletRequest request,
            final HttpServletResponse response,
            final ToDoController tmpTd) {
        TaskController t = new TaskController();
        t.setDescription(request.getParameter("task-desc"));
        t.setTitle(request.getParameter("task-title"));
        t.setStartDay(LocalDate.parse(request.getParameter("task-startDay")));
        t.setStartTime(LocalTime.parse(request.getParameter("task-startTime")));
        t.setFinalDay(LocalDate.parse(request.getParameter("task-lastDay")));
        t.setFinalTime(LocalTime.parse(request.getParameter("task-finalTime")));

        tmpTd.addTask(t);

        request.setAttribute("styles", "Task added");
    }

    /**
     * This method take the list of tasks in the TO DO list.
     *
     * @param request A request that can be used to perform actions,
     * but is not used in this method.
     * @param response A response that can be used to return the method result,
     * but is not used in this case.
     * @param tmpTd The ToDoController that will be
     * responsible for list the tasks
     * @see HttpServletRequest
     * @see HttpServletResponse
     * @see ToDoController
     */
    private void listTasks(final HttpServletRequest request,
            final HttpServletResponse response,
            final ToDoController tmpTd) {
        request.setAttribute("styles", tmpTd.toString());
    }

    /**
     * This method take a Task from the TO DO list.
     *
     * @param request A request with the parameters what
     * will used to add the task.
     * @param response A response that can be used to return the method result,
     * but is not used in this case.
     * @param tmpTd The ToDoController that will be
     * responsible for add the task.
     * @see HttpServletRequest
     * @see HttpServletResponse
     * @see ToDoController
     */
    private void checkTask(final HttpServletRequest request,
            final HttpServletResponse response,
            final ToDoController tmpTd) {
        request.setAttribute("style", tmpTd.checkTask(
                Integer.parseInt(request.getParameter("id"))));
    }

}

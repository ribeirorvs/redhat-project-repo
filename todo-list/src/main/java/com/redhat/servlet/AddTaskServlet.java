/**
 * 
 */
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
 * @author roribeir
 *
 */
public class AddTaskServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, 
						HttpServletResponse response) throws ServletException, IOException {
		ToDoController td = new ToDoController();
		TaskController t = new TaskController();
		t.setDescription(request.getParameter("task-desc"));
		t.setTitle(request.getParameter("task-title"));
		t.setStartDay(LocalDate.parse(request.getParameter("task-startDay")));
		t.setStartTime(LocalTime.parse(request.getParameter("task-startTime")));
		t.setFinalDay(LocalDate.parse(request.getParameter("task-lastDay")));
		t.setFinalTime(LocalTime.parse(request.getParameter("task-finalTime")));
		
		td.addTask(t);
		
		request.setAttribute("styles", "foi");
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}
}

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
public class ServletController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ToDoController td = new ToDoController();
	
	public void doPost(HttpServletRequest request, 
						HttpServletResponse response) throws ServletException, IOException {
		switch(request.getParameter("operation")) {
		case "addTask":
			addTask(request, response, td);
			break;
		case "listTasks":
			listTasks(request, response, td);
			break;
		case "checkTask":
			checkTask(request, response, td);
			break;
		}
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}
	
	private void addTask(HttpServletRequest request, 
						HttpServletResponse response,
						ToDoController td) {
		TaskController t = new TaskController();
		t.setDescription(request.getParameter("task-desc"));
		t.setTitle(request.getParameter("task-title"));
		t.setStartDay(LocalDate.parse(request.getParameter("task-startDay")));
		t.setStartTime(LocalTime.parse(request.getParameter("task-startTime")));
		t.setFinalDay(LocalDate.parse(request.getParameter("task-lastDay")));
		t.setFinalTime(LocalTime.parse(request.getParameter("task-finalTime")));
		
		td.addTask(t);
		
		request.setAttribute("styles", "Task added");
	}
	
	private void listTasks(HttpServletRequest request, 
			HttpServletResponse response,
			ToDoController td) {
		request.setAttribute("styles", td.toString());
	}
	
	private void checkTask(HttpServletRequest request,
							HttpServletResponse response,
							ToDoController td) {
		request.setAttribute("style", td.checkTask(
						Integer.parseInt(request.getParameter("id"))));
	}
	
}

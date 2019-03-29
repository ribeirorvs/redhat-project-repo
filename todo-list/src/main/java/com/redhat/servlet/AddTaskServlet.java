/**
 * 
 */
package com.redhat.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.redhat.controller.ToDoController;

/**
 * @author roribeir
 *
 */
public class AddTaskServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, 
						HttpServletResponse response) {
		ToDoController td = new ToDoController();
		
	}
}

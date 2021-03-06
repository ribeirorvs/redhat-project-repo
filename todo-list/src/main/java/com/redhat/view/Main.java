package com.redhat.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.redhat.controller.TaskController;
import com.redhat.controller.ToDoController;

/**
 * 
 * @author roribeir
 *
 */
public class Main {

	public static void main(String[] args) {
		ToDoController todoList = new ToDoController();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opt = 1;
		while(opt > 0) {
			System.out.println("Choose an option: ");
			System.out.println("1 - Include a task");
			System.out.println("2 - Verify a task");
			System.out.println("3 - Remove a task");
			System.out.println("4 - List all task");
			System.out.println("5 - Clear tasks");
			System.out.println("0 - Exit");
			try {
				opt = Integer.parseInt(reader.readLine());
			} catch (IOException e) {
				System.out.println("Error to read the option " + 
						e.getMessage());
			}
			switch(opt) {
			case 1:
				try {
					todoList.addTask();
				} catch (IOException e) {
					System.out.println("Error to add the task " +
							e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Informe o id da task: ");
					int id = Integer.parseInt(reader.readLine());
					TaskController t = todoList.checkTask(id);
					System.out.println(t.toString());
				} catch (NumberFormatException | IOException | NullPointerException e) {
					System.out.println("Error to found the task " + 
							e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Informe o id da task: ");
					int id = Integer.parseInt(reader.readLine());
					todoList.removeTask(id);
				} catch (NumberFormatException | IOException e) {
					System.out.println("Error to remove the task " + 
							e.getMessage());
				}
				break;
			case 4:
				List<TaskController> tasks = todoList.getTasks();
				System.out.println("Tasks {" + tasks.toString() + "}");
				break;
			case 5:
				todoList.clearToDo();
				break;
			default:
				if(opt > 0) {
					System.out.println("Invalid option " + opt + " !");
				}
			}
		}
	}
}

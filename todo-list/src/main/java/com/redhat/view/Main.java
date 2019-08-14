/**
 *
 */

package com.redhat.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import com.redhat.controller.TaskController;
import com.redhat.controller.ToDoController;

/**
 * Main class to run the application on console mode.
 *
 * @version 1.0
 * @author Rodrigo Vitor Ribeiro
 */
public final class Main {

    private Main() {
        throw new UnsupportedOperationException();
    }
    /**
     *
     * @param args is not used
     */
    public static void main(final String[] args) {
        ToDoController todoList = new ToDoController();
        BufferedReader reader = new BufferedReader(
                                        new InputStreamReader(System.in));
        int opt = 1;
        final int ADD_TASK_OPT = 1;
        final int CHECK_TASK_OPT = 2;
        final int REMOVE_TASK_OPT = 3;
        final int LIST_TASK_OPT = 4;
        final int CLEAR_TASK_OPT = 5;
        final int EXIT_OPT = 0;

        while (opt > 0) {
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
                System.out.println("Error to read the option "
                            + e.getMessage());
            }
            switch (opt) {
            case ADD_TASK_OPT:
                try {
                    todoList.addTask();
                } catch (IOException e) {
                    System.out.println("Error to add the task "
                            + e.getMessage());
                }
                break;
            case CHECK_TASK_OPT:
                try {
                    System.out.println("Informe o id da task: ");
                    int id = Integer.parseInt(reader.readLine());
                    TaskController t = todoList.checkTask(id);
                    System.out.println(t.toString());
                } catch (NumberFormatException
                            | IOException
                            | NullPointerException e) {
                    System.out.println("Error to found the task "
                            + e.getMessage());
                }
                break;
            case REMOVE_TASK_OPT:
                try {
                    System.out.println("Informe o id da task: ");
                    int id = Integer.parseInt(reader.readLine());
                    todoList.removeTask(id);
                } catch (NumberFormatException | IOException e) {
                    System.out.println("Error to remove the task "
                            + e.getMessage());
                }
                break;
            case LIST_TASK_OPT:
                List<TaskController> tasks = todoList.getTasks();
                System.out.println("Tasks {" + tasks.toString() + "}");
                break;
            case CLEAR_TASK_OPT:
                todoList.clearToDo();
                break;
            default:
                if (opt > EXIT_OPT) {
                    System.out.println("Invalid option " + opt + " !");
                }
            }
        }
    }
}

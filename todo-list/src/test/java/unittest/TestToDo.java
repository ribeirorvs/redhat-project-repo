package unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.redhat.model.Task;
import com.redhat.model.ToDo;

/**
 * Test class created to granter the
 * functionality of the ToDo class.
 *
 * @author Rodrigo Vitor Ribeiro
 */
class TestToDo {

    /**
     * Test if a ToDo can be initiated.
     *
     * @author Rodrigo Vitor Ribeiro
     */
	@Test
	void testToDo() {
		ToDo td = new ToDo();
		assertNotNull(td, "ToDo can't be created");
	}

	/**
	 * Test if a ToDo can be initiated with a list of Tasks.
	 *
	 * @author Rodrigo Vitor Ribeiro
	 */
	@Test
	void testToDoListOfTask() {
		List<Task> tasks = new ArrayList<Task>();
		for(int i = 0; i < 3; i++) {
			Task t = new Task();
			tasks.add(t);
		}
		ToDo td = new ToDo(tasks);
		assertNotNull(td);
	}

	/**
	 * Test the method getTasks.
	 *
	 * @author Rodrigo Vitor Ribeiro
	 */
	@Test
	void testGetTasks() {
		List<Task> tasks = new ArrayList<Task>();
		for(int i = 0; i < 3; i++) {
			Task t = new Task();
			tasks.add(t);
		}
		ToDo td = new ToDo(tasks);
		assertEquals(td.getTasks(), tasks, "Error to get Tasks");
	}

	/**
	 * Test the method setTasks.
	 *
	 * @author Rodrigo Vitor Ribeiro
	 */
	@Test
	void testSetTasks() {
		List<Task> tasks = new ArrayList<Task>();
		for(int i = 0; i < 3; i++) {
			Task t = new Task();
			tasks.add(t);
		}
		ToDo td = new ToDo();
		td.setTasks(tasks);
		assertEquals(td.getTasks(), tasks, "Error to set Tasks");
	}

	/**
	 * Test the method addTask.
	 *
	 * @author Rodrigo Vitor Ribeiro
	 */
	@Test
	void testAddTask() {
		Task t = new Task();
		ToDo td = new ToDo();
		td.addTask(t);
		assertNotNull(td.getTasks(), "Error to add a Task");
		assertEquals(td.getTasks().size(), 1, "Error to add a Task");
	}

	/**
	 * Test the method removeTask.
	 *
	 * @author Rodrigo Vitor Ribeiro
	 */
	@Test
	void testRemoveTask() {
		Task t = new Task();
		ToDo td = new ToDo();
		td.addTask(t);
		assertNotNull(td.getTasks(), "Error to add a Task");
		assertEquals(td.getTasks().size(), 1, "Error to add a Task");
		
		td.removeTask(t);
		assertEquals(td.getTasks().size(), 0, "Error to remove a Task");
	}

	/**
	 * Test the method clearToDo.
	 *
	 * @author Rodrigo Vitor Ribeiro
	 */
	@Test
	void testClearToDo() {
		List<Task> tasks = new ArrayList<Task>();
		for(int i = 0; i < 3; i++) {
			Task t = new Task();
			tasks.add(t);
		}
		ToDo td = new ToDo();
		td.setTasks(tasks);
		assertEquals(td.getTasks().size(), 3, "Error to set tasks");
		td.clearToDo();
		assertEquals(0, td.getTasks().size(), "Error to clear tasks");
	}

}

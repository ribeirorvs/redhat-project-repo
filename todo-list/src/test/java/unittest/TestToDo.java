package unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.redhat.model.Task;
import com.redhat.model.ToDo;

class TestToDo {

	@Test
	void testToDo() {
		ToDo td = new ToDo();
		assertNotNull(td, "ToDo can't be created");
	}

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

	@Test
	void testAddTask() {
		Task t = new Task();
		ToDo td = new ToDo();
		td.addTask(t);
		assertNotNull(td.getTasks(), "Error to add a Task");
		assertEquals(td.getTasks().size(), 1, "Error to add a Task");
	}

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

	@Test
	void testClearToDo() {
	}

	@Test
	void testToString() {
	}

}

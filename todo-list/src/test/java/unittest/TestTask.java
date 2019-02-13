package unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.redhat.model.Task;

class TestTask {

	/*@Before
	private void createTasks() {
		List<Task> tasks = new ArrayList<Task>();
		Task t;
		for (int i = 0; i < 4; i++) {
			t = new Task();
			t.setTitle("Task " + i);
			t.setDescription("Test task " + i);
			t.setFinalDay("2019-03-2" + i);
			t.setStartDay("2019-03-1" + i);
			t.setStartTime("00:0" + i + ":00");
			t.setFinalTime("01:0" + i + ":00");
			tasks.add(t);
		}
	}*/
	
	@Test
	void testConstructor() {
		Task t = new Task();
		assertNotNull(t, "Task can't be instanteated!");
	}
	
	@Test
	void testConstructorWithArgs() {
		LocalDate startDay, endDay;
		LocalTime startTime, endTime;
		
		startDay = LocalDate.parse("2018-12-30");
		endDay = LocalDate.now();
		
		startTime = LocalTime.parse("00:00");
		endTime = LocalTime.now();
		
		
		Task t = new Task(startDay, endDay, startTime, endTime,
							"Task title", "Task description");
		assertNotNull(t, "Task can't be instanteated!");
	}
	
	@Test
	void testSetTitle() {
		Task t = new Task();
		t.setTitle("Task title");
		assertEquals(t.getTitle(), "Task title", "Incorrect title");
	}

	@Test
	void testSetDescription() {
		Task t = new Task();
		t.setDescription("Task description");
		assertEquals(t.getDescription(), "Test description", "Incorrect decription");
	}
}

package unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import com.redhat.model.Task;

class TestTask {

	@Test
	void testTask() {
		Task t = new Task();
		assertNotNull(t, "Task can't be instanteated!");
	}

	@Test
	void testTaskLocalDateLocalDateLocalTimeLocalTimeStringString() {
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
	void testSetStartDay() {
		Task t = new Task();
		LocalDate day = LocalDate.now();
		t.setStartDay(day);
		assertEquals(t.getStartDay(), day, "Incorret start day");
	}

	@Test
	void testSetFinalDay() {
		Task t = new Task();
		LocalDate day = LocalDate.now();
		t.setFinalDay(day);
		assertEquals(t.getFinalDay(), day, "Incorret final day");
	}

	@Test
	void testSetStartTime() {
		Task t = new Task();
		LocalTime time = LocalTime.now();
		t.setStartTime(time);
		assertEquals(t.getStartTime(), time, "Incorret start time");
	}

	@Test
	void testSetFinalTime() {
		Task t = new Task();
		LocalTime time = LocalTime.now();
		t.setFinalTime(time);
		assertEquals(t.getFinalTime(), time, "Incorret final time");
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
		assertEquals(t.getDescription(), "Task description", "Incorrect decription");
	}

	@Test
	void testSetId() {
		Task t = new Task();
		t.setId(1000);
		assertEquals(t.getId(), 1000, "");
	}

}

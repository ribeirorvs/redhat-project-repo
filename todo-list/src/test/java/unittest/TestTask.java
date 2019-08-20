package unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import com.redhat.model.Task;

/**
 * Test class created to granter the
 * functionality of the Task class.
 *
 * @author Rodrigo Vitor Ribeiro
 */
class TestTask {

    /**
     * Test if a Task can be instantiated.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testCreateTask() {
        Task t = new Task();
        assertNotNull(t, "Task can't be instanteated!");
    }

    /**
     * Test if a Task can be instantiated with all parameters.
     *
     * @author Rodrigo Vitor Ribeiro
     */
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

    /**
     * Test the method setStartDay.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testSetStartDay() {
        Task t = new Task();
        LocalDate day = LocalDate.now();
        t.setStartDay(day);
        assertEquals(t.getStartDay(), day, "Incorret start day");
    }

    /**
     * Test the method setFinalDay.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testSetFinalDay() {
        Task t = new Task();
        LocalDate day = LocalDate.now();
        t.setFinalDay(day);
        assertEquals(t.getFinalDay(), day, "Incorret final day");
    }

    /**
     * Test the method setStartTime.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testSetStartTime() {
        Task t = new Task();
        LocalTime time = LocalTime.now();
        t.setStartTime(time);
        assertEquals(t.getStartTime(), time, "Incorret start time");
    }

    /**
     * Test the method setFinalTime.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testSetFinalTime() {
        Task t = new Task();
        LocalTime time = LocalTime.now();
        t.setFinalTime(time);
        assertEquals(t.getFinalTime(), time, "Incorret final time");
    }

    /**
     * Test the method setTitle.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testSetTitle() {
        Task t = new Task();
        t.setTitle("Task title");
        assertEquals(t.getTitle(), "Task title", "Incorrect title");
    }

    /**
     * Test the method setDescription.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testSetDescription() {
        Task t = new Task();
        t.setDescription("Task description");
        assertEquals(t.getDescription(), "Task description", "Incorrect decription");
    }

    /**
     * Test the method setId.
     *
     * @author Rodrigo Vitor Ribeiro
     */
    @Test
    void testSetId() {
        Task t = new Task();
        t.setId(1000);
        assertEquals(t.getId(), 1000, "");
    }
}

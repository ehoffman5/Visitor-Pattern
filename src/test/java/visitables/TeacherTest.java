package visitables;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void testGetName() {

        Teacher testTeacher = new Teacher("Bob", "Good");

        String name = testTeacher.getName();

        assertEquals("Bob", name);

    }

    @Test
    public void testGetHealthStatus() {

        Teacher testTeacher = new Teacher("Bob", "Good");

        String healthStatus = testTeacher.getHealthStatus();

        assertEquals("Good", healthStatus);

    }

}
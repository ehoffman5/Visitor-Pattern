package visitables;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testGetName() {

        Student testStudent = new Student("Bob", "Good");

        String name = testStudent.getName();

        assertEquals("Bob", name);

    }

    @Test
    public void testGetHealthStatus() {

        Student testStudent = new Student("Bob", "Good");

        String healthStatus = testStudent.getHealthStatus();

        assertEquals("Good", healthStatus);

    }

}
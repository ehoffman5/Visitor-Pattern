package visitors;

import org.junit.Test;
import visitables.Student;
import visitables.Teacher;

import static org.junit.Assert.assertEquals;

public class NurseTest {
    @Test
    public void testGetName() {

        Nurse testNurse = new Nurse("Bob");

        String name = testNurse.getName();

        assertEquals("Bob", name);

    }

    @Test
    public void testVisit1() {

        Nurse testNurse = new Nurse("Bob");
        Student testStudent = new Student("Bob2", "Good");

        String expectedReport = "Nurse 'Bob' did the checkup of the student 'Bob2' and found health is in 'Good' condition \n";

        String actualReport = testNurse.visit(testStudent);

        assertEquals(expectedReport, actualReport);

    }

    @Test
    public void testVisit2() {

        Nurse testNurse = new Nurse("Bob");
        Teacher testTeacher = new Teacher("Bob2", "Good");

        String expectedReport = "Nurse 'Bob' did the checkup of the teacher 'Bob2' and found health is in 'Good' condition \n";

        String actualReport = testNurse.visit(testTeacher);

        assertEquals(expectedReport, actualReport);

    }

}
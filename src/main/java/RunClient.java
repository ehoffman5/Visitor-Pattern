import visitables.Student;
import visitables.Teacher;
import visitors.Nurse;

import java.util.ArrayList;

public class RunClient {

    public static void main( String[] args ) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        // declare students that may attend the school
        Student johnny = new Student("Johnny", "Poor");
        Student ronny = new Student("Ronny", "Fair");
        Student lonny = new Student("Lonny", "Good");
        Student bonny = new Student("Bonny", "Excellent");

        // add students to list
        studentList.add(johnny);
        studentList.add(ronny);
        studentList.add(lonny);
        studentList.add(bonny);

        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

        // declare teachers that may teach at the school
        Teacher mrHoward = new Teacher("Mr. Howard", "Good");
        Teacher mrFine = new Teacher("Mr. Fine", "Fair");
        Teacher msHepburn = new Teacher("Ms. Hepburn", "Excellent");
        Teacher msDavis = new Teacher("Ms. Davis", "Poor");

        // add teachers to list
        teacherList.add(mrHoward);
        teacherList.add(mrFine);
        teacherList.add(msHepburn);
        teacherList.add(msDavis);


        // declare nurse visitor
        Nurse mrsSmith = new Nurse("Mrs. Smith");

        // loop to make all students accept the nurse's visit
        for(Student student : studentList) {
            student.accept(mrsSmith);
        }

        // loop to make all teachers accept the nurse's visit
        for(Teacher teacher : teacherList) {
            teacher.accept(mrsSmith);
        }
    }

}
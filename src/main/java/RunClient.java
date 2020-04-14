import java.util.ArrayList;

public class RunClient {

    public static void main( String[] args ) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        // declare students that may attend the school
        Student johnny = new Student("Johnny");
        Student ronny = new Student("Ronny");
        Student lonny = new Student("Lonny");
        Student bonny = new Student("Bonny");

        // add students to list
        studentList.add(johnny);
        studentList.add(ronny);
        studentList.add(lonny);
        studentList.add(bonny);

        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

        // declare teachers that may teach at the school
        Teacher mrHoward = new Teacher("Mr. Howard");
        Teacher mrFine = new Teacher("Mr. Fine");
        Teacher msHepburn = new Teacher("Ms. Hepburn");
        Teacher msDavis = new Teacher("Ms. Davis");

        // add teachers to list
        teacherList.add(mrHoward);
        teacherList.add(mrFine);
        teacherList.add(mrFine);
        teacherList.add(mrFine);


        // declare nurse visitor
        Nurse mrsSmith = new Nurse("Mrs. Smith");

        for(Student student : studentList)
        {
            student.accept(mrsSmith);
        }

        for(Teacher teacher : teacherList)
        {
            teacher.accept(mrsSmith);
        }
    }

}
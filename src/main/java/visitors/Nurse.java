package visitors;// This class sets up the properties and the visit methods of the visitor nurse

import interfaces.Visitor;
import visitables.*;

public class Nurse implements Visitor {

    private String name;

    public Nurse(String name) {
        this.name = name;
    }

    // getter method
    public String getName()
    {
        return name;
    }

    // visit method can be overridden for various visitable subjects
    public void visit(Student student) {
        System.out.println("Nurse '" + this.getName() + "' did the checkup of the student '"
                + student.getName()
                + "' and found health is in '"
                + student.getHealthStatus() + "' condition \n");

    }

    public void visit(Teacher teacher) {
        System.out.println("Nurse '" + this.getName() + "' did the checkup of the teacher '"
                + teacher.getName()
                + "' and found health is in '"
                + teacher.getHealthStatus() + "' condition \n");

    }

}

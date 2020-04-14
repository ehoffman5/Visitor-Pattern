// This class sets up the properties and the visit methods of the visitor nurse

public class Nurse implements Visitor {

    private String name;

    public Nurse(String name) { // name passes as a parameter
        super();
        this.name = name;
    }

    // getter method
    public String getName()
    {
        return name;
    }

    // visit method can be overridden for various visitable subjects
    public void visit(Student student) {
        student.setHealthStatus("Fair");
        System.out.println("Nurse: '" + this.getName() + "' did the checkup of the child: '"
                + student.getName()
                + "' and found health is in '"
                + student.getHealthStatus() + "' condition \n");

    }

    public void visit(Teacher teacher) {
        teacher.setHealthStatus("Poor");
        System.out.println("Nurse: '" + this.getName() + "' did the checkup of the child: '"
                + teacher.getName()
                + "' and found health is in '"
                + teacher.getHealthStatus() + "' condition \n");

    }

}

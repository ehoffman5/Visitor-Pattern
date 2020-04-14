package visitables;// This class sets up the properties of a visitable student

import interfaces.Visitable;
import interfaces.Visitor;

public class Student implements Visitable {

    private String name;
    private String healthStatus;

    public Student(String name, String healthStatus) {
        this.name = name;
        this.healthStatus = healthStatus;
    }

    // getter methods
    public String getName()
    {
        return name;
    }

    public String getHealthStatus()
    {
        return healthStatus;
    }


    // Method accepts a visitor to visit the student
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

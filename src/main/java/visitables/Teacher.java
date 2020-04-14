package visitables;// This class sets up the properties of a visitable teacher

import interfaces.Visitable;
import interfaces.Visitor;

public class Teacher implements Visitable {

    private String name;
    private String healthStatus;

    public Teacher(String name, String healthStatus) {
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


    // Method accepts a visitor to visit the teacher
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

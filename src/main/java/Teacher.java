// This class sets up the properties of a visitable teacher

public class Teacher implements Visitable {

    private String name;
    private String healthStatus;

    public Teacher(String name) { // name passes as a parameter
        super();
        this.name = name;
    }

    // getters and setters
    public String getName()
    {
        return name;
    }

    public String getHealthStatus()
    {
        return healthStatus;
    }

    public void setHealthStatus( String healthStatus )
    {
        this.healthStatus = healthStatus;
    }

    // Method accepts a visitor to visit the teacher
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

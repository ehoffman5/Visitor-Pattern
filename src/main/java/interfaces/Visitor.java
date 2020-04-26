package interfaces;

import visitables.*;

// The visitor pattern is used when you have to perform
// the same action on many objects of different types

public interface Visitor
{
    // add new method declaration for each new visitable class
    public String visit(Student student);
    public String visit(Teacher teacher);
}
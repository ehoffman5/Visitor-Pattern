// The visitor pattern is used when you have to perform
// the same action on many objects of different types

public interface Visitor
{
    // add new method declaration for each new visitable class
    public void visit(Student student);
    public void visit(Teacher teacher);
}
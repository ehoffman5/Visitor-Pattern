public interface Visitable
{
    // can add new method declarations if a new visitor is added
    public void accept(Visitor visitor);
}
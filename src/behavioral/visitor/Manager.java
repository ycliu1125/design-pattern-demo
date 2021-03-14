package behavioral.visitor;

public class Manager implements Employee {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

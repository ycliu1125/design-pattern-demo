package behavioral.visitor;

public class Worker implements Employee {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

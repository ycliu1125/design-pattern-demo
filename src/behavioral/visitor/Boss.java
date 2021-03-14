package behavioral.visitor;

public class Boss implements Employee {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

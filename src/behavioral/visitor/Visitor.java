package behavioral.visitor;

public interface Visitor {

    void visit(Boss boss);

    void visit(Manager manager);

    void visit(Worker worker);
}

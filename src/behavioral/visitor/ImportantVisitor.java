package behavioral.visitor;

public class ImportantVisitor implements Visitor {

    @Override
    public void visit(Boss boss) {
        System.out.println("重要訪客，拜訪老闆，老闆親自接見");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("重要訪客，拜訪經理，經理旁邊伺候");
    }

    @Override
    public void visit(Worker worker) {
        System.out.println("重要訪客，拜訪員工，沒你的份，回去工作!");
    }
}

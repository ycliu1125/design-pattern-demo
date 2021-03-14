package behavioral.visitor;

public class NormalVisitor implements Visitor {

    @Override
    public void visit(Boss boss) {
        System.out.println("普通訪客，拜訪老闆，請先辦理流程並預約");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("普通訪客，拜訪經理，請稍等一下");
    }

    @Override
    public void visit(Worker worker) {
        System.out.println("普通訪客，拜訪員工，自己出去接見");
    }
}

package behavioral.visitor;

/*
    訪問者模式 (Visitor Pattern)
    In Visitor pattern, we use a visitor class
    which changes the executing algorithm of an element class.
    By this way, execution algorithm of element can vary as and when visitor varies.

    As per the pattern, element object has to "accept" the visitor object
    so that visitor object handles the operation on the element object.
    首先我們擁有一個由許多物件構成的對象結構，這些物件都擁有一個accept方法用來接受訪問者；
    訪問者是一個接口，它擁有一個visit方法，這個方法對訪問到的對象結構中不同類型的元素作出不同的反應；
    在物件結構的一次訪問過程中，我們遍歷整個物件結構，對每一個元素都實施accept方法，
    在每一個元素的accept方法中回調訪問者的visit方法，從而使"訪問者得以處理"物件結構的每一個元素。

    我們可以針對物件結構設計不同的實在的訪問者來完成不同的操作。

    大部分的狀況之下不需要使用這個模式。
    在資料結構穩定(甚至固定)時才適合使用，
    如果任意使用反而會造成(資料結構)擴充困難的結果。

 */
public class VisitorMain {

    public static void main(String[] args) {

        Company company = new Company();
        company.getEmployeeList().add(new Boss());
        company.getEmployeeList().add(new Manager());
        company.getEmployeeList().add(new Worker());

        Visitor normalVisitor = new NormalVisitor();
        Visitor importantVisitor = new ImportantVisitor();

        System.out.println("----  一般訪客  ----");
        company.accept(normalVisitor);
        System.out.println("----  重要訪客  ----");
        company.accept(importantVisitor);

    }
}

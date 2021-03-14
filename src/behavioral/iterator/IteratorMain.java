package behavioral.iterator;

/*
    迭代器模式(Iterator Pattern)
    提供一種方法依序存取一個聚合物件中各個元素，而又不暴露該物件的內部表示。

    這一個可以這樣想，想像最後的Main方法會這個樣子，然後倒推

    ObjectA objectA = new ObjectA();
    Iterator iterator = objectA.getIterator();

    while(iterator.hasNext()){
        // doSomething();
        iterator.next();
    }
 */
public class IteratorMain {

    public static void main(String[] args) {

        NameRepository repository = new NameRepository();
        Iterator iterator = repository.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
}

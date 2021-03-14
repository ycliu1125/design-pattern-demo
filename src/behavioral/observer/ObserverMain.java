package behavioral.observer;

/*
    觀察者模式 (Observer Pattern)
    is used when there is one-to-many relationship between objects
    such as if one object is modified, its dependent objects are to be notified automatically.

 */
public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);


    }
}

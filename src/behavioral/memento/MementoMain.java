package behavioral.memento;

/*
    備忘錄模式 (Memento Pattern)
    is used to restore state of an object to a previous state.

    Memento：負責儲存需要儲存的狀態的類。
    Originator：提供建立Memento或是回復到某個Memento的狀態的方法。
    CareTaker：負責保存備忘錄(Memento)的類別。
 */
public class MementoMain {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());


    }
}

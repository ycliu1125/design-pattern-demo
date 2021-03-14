package behavioral.mediator;

/*
    仲介者模式 (Mediator Pattern)
    用一個仲介物件來封裝一系列的物件互動。
    仲介者使個物件不需要顯式地互相參考，
    從而使其耦合鬆散，而且可以獨立地改變它們之間的互動。

 */
public class MediatorMain {

    public static void main(String[] args) {

        User anny = new User("Anny");
        User john = new User("John");

        anny.sendMessage("Hi, my name is Anny~ ");
        john.sendMessage("Hi Anny, my name is John");

    }
}
/*
    "顯示訊息"是 ChatRoom 的責任
    而使用者 使用ChatRoom 的方法來分享他們的訊息
    use User objects to show communication between them.
 */

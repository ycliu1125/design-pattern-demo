package behavioral.command;

/*
    命令模式 (Command Pattern)
    是將對行爲進行封裝的典型模式，它嘗試以物件來代表實際行動。
    將命令的接收者跟執行者切分開來。
 */
public class CommandMain {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Speaker speaker = new Speaker();
        Command turnOn = new TurnOn(speaker);
        Command turnOff = new TurnOff(speaker);
        Command louder = new Louder(speaker);
        Command lower = new Lower(speaker);

        invoker.addCommand(turnOn);
        invoker.addCommand(louder);
        invoker.addCommand(louder);
        invoker.addCommand(lower);
        invoker.addCommand(turnOff);

        invoker.execute();

    }

}
/*
    其實範例將 "動作" 設為類別 有點不太合乎常理
    或者可以這樣想，某部門只會執行某特定動作
    那麼便可以用部門當作類別名稱 將這個動作封裝進該類別
    就可以達到一樣的效果

 */
package behavioral.strategy;

/*
    策略模式 (Strategy Pattern)
    In Strategy pattern, a class behavior or its algorithm can be changed at run time.

    用策略的介面來替換在某個實體ˋ中的方法，
    可以經由替換不同的策略使得物件擁有不同的行為。
    經過策略的組合，我們得以獲得行為不同的物件。

 */
public class StrategyMain {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("OperationAdd: " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationMinus());
        System.out.println("OperationMinus: " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationMultiply());
        System.out.println("OperationMultiply: " + context.executeStrategy(10, 5));


    }

}

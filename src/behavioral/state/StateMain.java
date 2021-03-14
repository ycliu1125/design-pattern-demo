package behavioral.state;

/*
    狀態模式(State Pattern)
    a class behavior changes based on its state.

    將行為用一個介面封裝起來，針對不同的狀態去改變其行為。

 */
public class StateMain {

    public static void main(String[] args) {

        ApplyCase applyCase = new ApplyCase();

        StartState startState = new StartState();
        StopState stopState = new StopState();

        System.out.println(applyCase.getState());
        startState.judge(applyCase);
        System.out.println(applyCase.getState());
        stopState.judge(applyCase);
        System.out.println(applyCase.getState());

    }
}

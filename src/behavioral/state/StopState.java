package behavioral.state;

public class StopState implements State {

    @Override
    public void judge(ApplyCase applyCase) {
        System.out.println("結束的案件, 不用處理啦!!~");
        applyCase.setState(this);
    }

    @Override
    public String toString() {
        return "案件狀態：結案";
    }
}

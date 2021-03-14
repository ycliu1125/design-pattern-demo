package behavioral.state;

public class StartState implements State {

    @Override
    public void judge(ApplyCase applyCase) {
        System.out.println("剛申請的案件~ 處理一下~");
        applyCase.setState(this);
    }

    @Override
    public String toString() {
        return "案件狀態：申請";
    }
}

package behavioral.command;

public class TurnOff extends Command {

    public TurnOff(Speaker speaker) {
        super(speaker);
    }

    @Override
    public void execute() {
        speaker.turnOff();
    }
}

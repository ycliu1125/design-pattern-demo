package behavioral.command;

public class TurnOn extends Command {

    public TurnOn(Speaker speaker) {
        super(speaker);
    }

    @Override
    public void execute() {
        speaker.turnOn();
    }
}

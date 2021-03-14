package behavioral.command;

public class Lower extends Command {

    public Lower(Speaker speaker) {
        super(speaker);
    }

    @Override
    public void execute() {
        speaker.lower();
    }
}

package behavioral.command;

public class Louder extends Command {

    public Louder(Speaker speaker) {
        super(speaker);
    }

    @Override
    public void execute() {
        speaker.louder();
    }
}

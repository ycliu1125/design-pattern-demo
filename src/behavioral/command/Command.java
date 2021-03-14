package behavioral.command;

public abstract class Command {

    Speaker speaker;

    public Command(Speaker speaker) {
        this.speaker = speaker;
    }

    public abstract void execute();
}

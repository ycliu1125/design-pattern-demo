package behavioral.chainOfResponsibility;

public abstract class AbstractLogger {

    public static int TRACE = 1;
    public static int INFO = 3;
    public static int ERROR = 5;

    protected AbstractLogger nextLogger;
    protected int level;

    abstract protected void write(String message);

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

}

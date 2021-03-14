package behavioral.chainOfResponsibility;

public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        level = AbstractLogger.INFO;
        nextLogger = new TraceLogger();
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO :: Logger: " + message);
    }
}

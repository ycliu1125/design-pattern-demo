package behavioral.chainOfResponsibility;

public class TraceLogger extends AbstractLogger {

    public TraceLogger() {
        level = AbstractLogger.TRACE;
    }

    @Override
    protected void write(String message) {
        System.out.println("Trace :: Logger: " + message);
    }
}

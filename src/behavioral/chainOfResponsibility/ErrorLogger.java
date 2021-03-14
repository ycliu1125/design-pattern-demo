package behavioral.chainOfResponsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        level = AbstractLogger.ERROR;
        nextLogger = new InfoLogger();
    }

    @Override
    protected void write(String message) {
        System.out.println("Error :: Logger: " + message);
    }
}

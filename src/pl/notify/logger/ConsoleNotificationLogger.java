package pl.notify.logger;

public class ConsoleNotificationLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println(message);
    }

}
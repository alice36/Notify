package pl.notify.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleNotificationLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public void logFile(String message) throws IOException {
        FileWriter fileWriter = new FileWriter("notificationsLog.csv", true);
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        bfw.write(message);
        bfw.newLine();
        bfw.close();
    }
}
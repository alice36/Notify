package pl.notify.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotificationLogger implements Logger{

    @Override
    public void log(String message) throws IOException {
        FileWriter fileWriter = new FileWriter("notificationsLog.csv", true);
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        bfw.write(message);
        bfw.newLine();
        bfw.close();
    }
}

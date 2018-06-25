package pl.notify.app;

import pl.notify.logger.ConsoleNotificationLogger;
import pl.notify.logger.FileNotificationLogger;
import pl.notify.reader.FileNotificationReader;
import pl.notify.sender.EmailNotificationSender;

import java.io.IOException;

public class NotificationSystem {
    public static void main(String[] args) {

        FileNotificationReader reader = new FileNotificationReader();
        EmailNotificationSender sender = new EmailNotificationSender();
        FileNotificationLogger logger = new FileNotificationLogger();

        NotificationFacade facade = new NotificationFacade(reader,sender,logger);

        try {
            facade.sendAllNotifications();
        } catch (IOException e) {
            System.err.println("Nie udało się wysłać powiadomień");
        }
    }
}
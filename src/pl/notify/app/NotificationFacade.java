package pl.notify.app;

import pl.notify.logger.Logger;
import pl.notify.model.Notification;
import pl.notify.reader.Reader;
import pl.notify.sender.Sender;

import java.io.IOException;
import java.util.List;

public class NotificationFacade {
    private Reader reader;
    private Sender sender;
    private Logger logger;

    public NotificationFacade(Reader reader, Sender sender, Logger logger) {
        this.reader = reader;
        this.sender = sender;
        this.logger = logger;
    }

    public void sendAllNotifications() throws IOException {
        List<Notification> notifications = reader.getNotifications();
        for (Notification notification : notifications) {
            sender.sendNotification(notification);
            logger.logFile("Wysłano wiadomość do " + notification.getEmail());
        }
    }

}
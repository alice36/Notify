package pl.notify.sender;

import pl.notify.model.Notification;

public class EmailNotificationSender implements Sender {

    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending e-mail notification to " + notification);
    }

}
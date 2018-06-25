package pl.notify.sender;

import pl.notify.model.Notification;

public class SmsNotificationSender implements Sender {

    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending sms notification to " + notification);
    }

}

package pl.notify.sender;

import pl.notify.model.Notification;

public interface Sender {
    public void sendNotification(Notification notification);
}

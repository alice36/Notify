package pl.notify.reader;

import pl.notify.model.Notification;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerNotificationReader implements Reader {

    @Override
    public List<Notification> getNotifications() throws IOException {
        String username;
        String email;
        String telephone;
        String content;
        List<Notification> notifications = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj dane do wysłania");
            username = input.nextLine();
            email = input.nextLine();
            telephone = input.nextLine();
            content = input.nextLine();
            notifications.add(new Notification(username, email, telephone, content));
            }
        return notifications;
    }

}

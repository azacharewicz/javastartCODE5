package pl.notify.reader;

import pl.notify.model.Notification;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNotificationReader {

    public List<Notification> getNotifications() throws IOException {
        List<String> notificationsString = Files.readAllLines(Paths.get("notifications.csv"));
        List<Notification> notifications = new ArrayList<>();
        for (String notifyString : notificationsString) {
            String[] split = notifyString.split(";");
            Notification notificaion = new Notification(split[0], split[1], split[2], split[3]);
            notifications.add(notificaion);
        }
        return notifications;
    }

}

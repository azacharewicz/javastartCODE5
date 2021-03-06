package pl.notify.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.io.IOException;


@Configuration
@ComponentScan("pl.notify")
public class NotificationApplicationAuto {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(NotificationApplicationAuto.class);
        NotificationFacade notificationFacade = context.getBean(NotificationFacade.class);
        try {
            notificationFacade.sendNotifications();
        } catch (IOException e) {
            System.err.println("Wysłanie powiadomień zakończyło się niepowodzeniem!");
        }
    }
}

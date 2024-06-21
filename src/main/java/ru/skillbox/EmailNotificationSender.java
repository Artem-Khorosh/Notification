package ru.skillbox;

import java.util.List;
import ru.skillbox.notification_sender.NotificationSender;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {

  @Override
  public void send(EmailNotification notification) {
    System.out.println("EMAIL");
    System.out.println("subject: " + notification.getSubject());
    System.out.println("recipients: " + String.join(", ", notification.getRecipients()));
    System.out.println("message: " + notification.formattedMessage());
  }

  @Override
  public void send(List<EmailNotification> notifications) {
    for (EmailNotification notification : notifications) {
      send(notification);
    }
  }
}

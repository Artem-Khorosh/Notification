package ru.skillbox;

import java.util.List;
import ru.skillbox.notification_sender.NotificationSender;

public class PushNotificationSender implements NotificationSender<PushNotification> {

  @Override
  public void send(PushNotification notification) {
    System.out.println("PUSH");
    ;
    System.out.println("title: " + notification.getTitle());
    System.out.println("userAccount: " + String.join(", ", notification.getUserAccount()));

    System.out.println("message: " + notification.formattedMessage());
  }

  @Override
  public void send(List<PushNotification> notifications) {
    for (PushNotification notification : notifications) {
      send(notification);
    }
  }
}

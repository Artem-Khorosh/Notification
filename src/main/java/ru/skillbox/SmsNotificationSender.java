package ru.skillbox;

import java.util.List;
import ru.skillbox.notification_sender.NotificationSender;

public class SmsNotificationSender implements NotificationSender<SmsNotification> {

  @Override
  public void send(SmsNotification notification) {
    System.out.println("SMS");
    System.out.println("recipients: " + String.join(", ", notification.getPhoneNumber()));
    System.out.println("message: " + notification.formattedMessage());
  }

  @Override
  public void send(List<SmsNotification> notifications) {
    for (SmsNotification notification : notifications) {
      send(notification);
    }
  }
}

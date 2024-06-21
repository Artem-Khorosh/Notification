package ru.skillbox;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    EmailNotification emailNotification = new EmailNotification("Welcome",
        Arrays.asList("user1@example.com", "user2@example.com"),
        "Thank you for registering on our service!");

    SmsNotification smsNotification = new SmsNotification(
        Arrays.asList("1234567890", "0987654321"),
        "Thank you for registering on our service!"
    );

    PushNotification pushNotification = new PushNotification(
        "Welcome",
        "user123",
        "Thank you for registering on our service!"
    );
    EmailNotificationSender emailNotificationSender = new EmailNotificationSender();
    SmsNotificationSender smsNotificationSender = new SmsNotificationSender();
    PushNotificationSender pushNotificationSender = new PushNotificationSender();

    emailNotificationSender.send(emailNotification);
    smsNotificationSender.send(smsNotification);
    pushNotificationSender.send(pushNotification);

    List<EmailNotification> emailNotifications = Arrays.asList(emailNotification,
        new EmailNotification("Update", Arrays.asList("user3@example.com"),
            "Your profile has been updated."),
        new EmailNotification("Alert", Arrays.asList("user4@example.com"),
            "Suspicious activity detected."));
    List<SmsNotification> smsNotifications = Arrays.asList(
        smsNotification,
        new SmsNotification(Arrays.asList("1122334455"), "Your OTP is 123456."),
        new SmsNotification(Arrays.asList("5566778899"), "Your balance is low.")
    );
    List<PushNotification> pushNotifications = Arrays.asList(
        pushNotification,
        new PushNotification("Reminder", "user456", "Don't forget your meeting at 3 PM."),
        new PushNotification("Promotion", "user789", "Check out our new discounts!")
    );
    emailNotificationSender.send(emailNotifications);
    smsNotificationSender.send(smsNotifications);
    pushNotificationSender.send(pushNotifications);
  }
}

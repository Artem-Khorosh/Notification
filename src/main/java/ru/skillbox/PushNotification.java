package ru.skillbox;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.skillbox.notification.Notification;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PushNotification implements Notification {

  private String title;
  private String userAccount;
  private String message;


  @Override
  public String formattedMessage() {
    return "\ud83d\udc4b " + message;
  }


}

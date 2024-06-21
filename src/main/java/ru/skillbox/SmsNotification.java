package ru.skillbox;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.skillbox.notification.Notification;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SmsNotification implements Notification {

  private List<String> phoneNumber;
  private String message;


  @Override
  public String formattedMessage() {
    return message;
  }
}

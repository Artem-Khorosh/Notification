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

public class EmailNotification implements Notification {

  private String subject;
  private List<String> recipients;
  private String message;


  @Override
  public String formattedMessage() {
    return "<p> " + message + " </p>";
  }

}

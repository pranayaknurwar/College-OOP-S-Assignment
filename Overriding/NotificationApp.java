package Overriding;

class Notification {
    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email notification");
    }
}

class SmsNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS notification");
    }
}

public class NotificationApp {
    public static void main(String[] args) {
        Notification notification;

        notification = new EmailNotification();
        notification.send();

        notification = new SmsNotification();
        notification.send();
    }
}

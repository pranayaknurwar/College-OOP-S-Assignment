package Interface;

interface NotificationService {
    void send(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationManager {
    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.send(message);
    }
}


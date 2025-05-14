package designPattern.Creational.Factory;

public class NotificationFactory {
    public Notification createNotification(String notification){

        switch (notification){
            case "SMS" -> {
                return new SMSNotification();
            }
            case "Email" -> {
                return new EmailNotification();
            }
            default -> throw new IllegalArgumentException("Notification type not found" + notification);
        }

    }
}

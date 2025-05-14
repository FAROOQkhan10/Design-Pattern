package designPattern.Creational.Factory;

public class FactoryDesignPattern {

    /*
    Suppose you're creating a notification system that sends
    different types of notifications: SMS, Email.
    */

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("Email");
        notification.notifyUsers();
    }


}

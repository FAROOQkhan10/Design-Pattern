package designPattern.Creational.Factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUsers() {
        System.out.println("SMS notification is send");
    }
}

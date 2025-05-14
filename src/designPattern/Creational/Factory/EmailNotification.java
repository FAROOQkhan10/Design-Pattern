package designPattern.Creational.Factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUsers() {
        System.out.println("Email Notification is send");
    }
}

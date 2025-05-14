package designPattern.Creational.AbstractFactory;

public class Toyota implements Vehicle{
    @Override
    public void start() {
        System.out.println("Toyota start");
    }

    @Override
    public void stop() {
        System.out.println("Toyota stop");
    }
}

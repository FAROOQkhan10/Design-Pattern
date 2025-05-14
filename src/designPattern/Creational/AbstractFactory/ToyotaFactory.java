package designPattern.Creational.AbstractFactory;

public class ToyotaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Toyota();
    }
}

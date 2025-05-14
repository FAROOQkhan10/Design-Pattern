package designPattern.Creational.AbstractFactory;

public class HondaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}

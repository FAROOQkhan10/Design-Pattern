package designPattern.Creational.AbstractFactory;

public class AbstractFactory {

    /*
     In the Abstract Factory pattern, the "Abstract" part refers to the fact that the
     client code doesn’t know about the specific classes of objects being created.
     Instead of directly interacting with the concrete classes (like Honda, Toyota, or BMW),
     the client only knows about the factory interfaces (like VehicleFactory), which provide a method
     for creating objects without exposing the actual classes behind them.


    Think of it like ordering a car from a dealership. As a customer, you don’t need to know the
     intricate(complex) details of how each car is built or which parts are used. You just choose the type of
      car you want (Honda, Toyota, BMW), and the factory (dealership) handles the rest.
      This is the abstraction at play: you only deal with the abstract factory interface,
      not the specific car details.

🏭Factory Method vs. Abstract Factory Design Pattern
Aspect	            Factory Method	                                           Abstract Factory
1. Purpose	        Creates one type of object	                               Creates families of related objects
2. Scope	        Focuses on creating a single product	                   Creates multiple related products
3. Abstraction	    Deals with one product type at a time	                   Deals with groups (families) of related products
4. Example	        CarFactory creates only cars	                           VehicleFactory creates cars, trucks, and bikes of the same brand
5. Flexibility	    Adding new products requires modifying the factory	       Adding new families doesn’t affect existing code
6. Use Case	        When you need to create a single product (e.g., one car)  When you need to create related products (e.g., brand-specific parts)

     */

    public static void main(String[] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();
    }

}

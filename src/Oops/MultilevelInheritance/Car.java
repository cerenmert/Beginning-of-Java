package Oops.MultilevelInheritance;

public class Car {
    public Car() {
        System.out.println("Creating Constructor of the Car Class");
    }
    public final void setWheels(){
        System.out.println("Only 4 wheels are allowed");
        //final method can't be overridden in any child class!
    }
    String name = "Car Segment";

    public void run() {
        System.out.println("Car is running");
    }
}

package Oops.MultilevelInheritance;

public class BMW extends Car {

    String name = "BWM";

    public BMW() {
        super(); // actually no need to use super method in here. Because, when you create object of child class, parent class constructor will automatically called!
        System.out.println("Call BMW Constructor");
    }

    /*
    public setWheels(){

        //final methods can't be overridden in any child class! so this gives a warning.
    }
    */

    public void getName() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public void run() {
        System.out.println("BMW is running");
        super.run();
    }

    public static void main(String[] args) {
//        Car car = new Car();
//        System.out.println(name);
//        car.run();
        BMW bmw = new BMW();
        bmw.getName();
        bmw.run();
    }
}

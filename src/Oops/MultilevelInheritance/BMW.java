package Oops.MultilevelInheritance;

public class BMW extends Car {

    static String name = "BWM";

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(name);
        car.run();
    }
}

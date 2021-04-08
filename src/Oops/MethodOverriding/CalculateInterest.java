package Oops.MethodOverriding;

public class CalculateInterest {
    public static void main(String[] args) {
        ZiraatBank zb= new ZiraatBank();
        GarantiBank gb= new GarantiBank();
        Finansbank fb= new Finansbank();

        System.out.println(zb.getInterest());
        System.out.println(gb.getInterest());
        System.out.println(fb.getInterest());

        // this is run-time polymorphism or dynamic polymorphism
        // java decides that which method (parent's or child class method) should be called with help of object.
        // this is method overriding, we can override the same method which is present inside the parent class,
        // we can override the same method inside the child class and we can call it on the bases of the object of the child class
        // we have the same method which is extending a single class bank, but they have their own implementation
        // this not possible with method overloading, it's totally different

    }
}

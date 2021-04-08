package Oops.MethodOverloading;

public class Addition {

    //this is called method overloading
    //code readability
    //this is a part of static polymorphism: because, we have a same task but multiple forms

    public void addValues(int a, int b) {
        int c = a + b;
        System.out.println("Total is " + c);
    }

    public void addValues(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Total is " + d);
    }
    public double addValues(double a, double b){
        double c= a+b;
        return c;
    }

}

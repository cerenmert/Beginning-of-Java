package Oops.Abstraction;

abstract public class ShapeForAbstract {
    //Abstract class needs to be extended
    //Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    //Abstraction lets you focus on what the object does instead of how it does it.
    //at least one abstract method should be defined inside the abstract class, or we will get a compile-time error.
    //abstract class can not be instantiated, it means we can not create an object of the abstract class.

    abstract public void displayShape();  //Abstract methods don't have any implementation (They don't have any body)

    public void displayName() {
        System.out.println("from shape class");
    }
}

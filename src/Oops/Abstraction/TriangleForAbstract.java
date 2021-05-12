package Oops.Abstraction;

public class TriangleForAbstract extends ShapeForAbstract {
    //child class (TriangleForAbstract) should implement abstract methods of the parent abstract class(ShapeForAbstract)
    //so we implemented/override the displayShape() method here again.

    @Override
    public void displayShape() {
        System.out.println("Shape is Triangle");

    }
}

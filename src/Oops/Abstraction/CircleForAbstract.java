package Oops.Abstraction;

public class CircleForAbstract extends ShapeForAbstract {

    //child class (CircleForAbstract) should implement abstract methods of the parent abstract class(ShapeForAbstract)
    //so we implemented/override the displayShape() method here again.

    @Override
    public void displayShape() {
        System.out.println("Shape is Circle");
    }

    public static void main(String[] args) {
        ShapeForAbstract s1 = new CircleForAbstract();
        ShapeForAbstract s2 = new TriangleForAbstract();
        s1.displayShape();
        s2.displayShape();
    }
}

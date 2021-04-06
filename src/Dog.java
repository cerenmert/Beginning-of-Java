public class Dog {

    String name = "Jacky";
    String type = "Bulldog";
    int height = 4;

    public void barking() {
        System.out.println(name + " is barking ");
    }

    public void eating() {
        System.out.println(name + " is eating meat ");
    }

    public static void main(String[] args) {
        Dog dogclass = new Dog();  // we're creating an object of Dog class. we're initializing the class
        Dog dogclass2 = new Dog();  //multiple object of same class can be created
        System.out.println(dogclass.height);
        System.out.println(dogclass.type);
        dogclass.barking();
        dogclass2.eating();

    }

}

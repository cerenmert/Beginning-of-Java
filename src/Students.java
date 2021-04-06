public class Students {

    //this is the structure of constructor
    //there is no explicit return type such as void, string.. (illegal modifier error for: public static Students)
    // "public" is a access modifier

    // this is default constructor
    public Students() {
        System.out.println("Hi, I am inside the default constructor");
    }

    int rollNumber;
    String name;

    // and this is the parameterised constructor
    public Students(int i, String j) {
        rollNumber = i;
        name = j;
    }

    public void display() {
        System.out.println("Roll Number is: " + rollNumber + " and Name is: " + name);
    }

    public static void main(String[] arg) {
        Students std = new Students(); // now, I'm creating an object of my class

        //while I didn't call Students() constructor in my main method, how message is printed?
        //because, when you created object of your class like here "Students std= new Students();", default constructor will automatically called!

        Students std1 = new Students(10, "James");
        Students std2 = new Students(20, "Caroline");
        std1.display();
        std2.display();
    }
}

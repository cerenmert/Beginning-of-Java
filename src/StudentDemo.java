public class StudentDemo {

    int rollNumber;
    String name;
    String standard;

    //constructor is created
    //we are assigning current instance variable to the object with "this"

    public StudentDemo(int rollNumber, String name, String standard) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.standard = standard;
    }
    //we can do this in below i,n,s parameterised constructor but it is not meaningful with i,n,s

//    public StudentDemo(int i, String n, String s) {
//        rollNumber = i;
//        name = n;
//        standard = s;
//    }

    public void display() {
        System.out.println("Student Roll Number: " + rollNumber + " name is: " + name + " and in class: " + standard);
    }

    public static void main(String[] args) {
        StudentDemo std = new StudentDemo(10, "Frank", "2nd");
        StudentDemo std1 = new StudentDemo(20, "Michael", "5th");
        std.display();
        std1.display();

    }
}


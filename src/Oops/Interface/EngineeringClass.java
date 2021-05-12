package Oops.Interface;

public class EngineeringClass implements Student {

    public void displayName() {
        System.out.println("Hi, we're from engineering department");
    }


    public void getStudentNumber() {
        System.out.println("We're 120 students");
    }


    public void getStandard() {
        System.out.println("We're from Software");
    }

    public void getUniversity(){
        System.out.println("University name is: "+Student.university);
    }

    @Override
    public void getInterfaceName() {
        System.out.println("We're from Interface");
    }
}

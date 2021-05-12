package Oops.Interface;

public class MedicalClass implements Student {

    public void displayName() {
        System.out.println("Hi, we're from Medical department");
    }

    public void getStudentNumber() {
        System.out.println("We're 100 students");
    }

    public void getStandard() {
        System.out.println("We're from MBBS");
    }

    public void getUniversity(){
        System.out.println("University name is London");
    }

    public static void main(String[] args) {
        EngineeringClass eng= new EngineeringClass();
        eng.displayName();
        eng.getStandard();
        eng.getStudentNumber();
        eng.getUniversity();
        System.out.println("**********");
        MedicalClass med= new MedicalClass();
        med.displayName();
        med.getStandard();
        med.getStudentNumber();
        med.getUniversity();
    }

    @Override
    public void getInterfaceName() {

    }
}

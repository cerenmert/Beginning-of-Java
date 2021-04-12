package Oops.Encapsulation;

public class BankLoan {

    private String name;
    private int age;
    private int amount;

    //SET methods
    //if we are just defining the SETTERS, these class will be write-only class
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if (age >=18 && age <=50) {
            this.age = age;
        }
        else{
            System.out.println("Please enter the valid age");
        }
    }

    public void setAmount(int amount){
        if(amount >=1000 && amount <= 100000){
            this.amount=amount;
        }
        else{
            System.out.println("Please enter the valid amount between 1000 and 100000!");
        }

    }

    // GET methods
    //if we are just defining the GETTERS, these class will be read-only class
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getAmount(){
        return amount;
    }
}

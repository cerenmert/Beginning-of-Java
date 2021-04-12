package Oops.Encapsulation;

public class GarantiBankLoan extends BankLoan{

    public static void main(String[] args) {

        BankLoan bankLoan = new BankLoan();
        bankLoan.setAge(200);
        bankLoan.setName("Johny Caribbean");
        bankLoan.setAmount(2000000000);

        System.out.println("Name is " + bankLoan.getName());
        System.out.println("Age is " + bankLoan.getAge());
        System.out.println("Amount is " + bankLoan.getAmount());
    }
}

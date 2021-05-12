package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            String text1 = "Ceren";
            System.out.println(text1);

            String text2 = null;
            System.out.println(text2.length()); //this will throw an exception
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            System.out.println("Finally Block will execute before the Catch Block");
        }
    }
}

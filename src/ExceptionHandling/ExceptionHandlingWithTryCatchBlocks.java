package ExceptionHandling;

public class ExceptionHandlingWithTryCatchBlocks {
    public static void main(String[] args) {
        try {
            int value = 100;
            int result = value / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("pls chose another value to divide");
            e.printStackTrace();
        }
    }
}

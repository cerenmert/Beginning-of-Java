package ExceptionHandling;

public class NestedTryCatchForExceptionHandling {
    public static void main(String[] args) {
        try {
            String text1 = "Ceren";
            System.out.println(text1.length());
            try {
                String text2 = "Berfin";
                System.out.println(text2.length());
                try {
                    String text3 = "Anıl";
                    System.out.println(text3.length());
                    try {
                        int[] array = new int[3];
                        array[5] = 100;  // this gives exception error, because there are only 3 elements of the array
                    } catch (Exception e) {
                        System.out.println("Int Fourth Try END");
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    System.out.println("Anıl Third Try END");
                    e.printStackTrace();
                }
            } catch (Exception e) {
                System.out.println("Berfin Second Try END");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Ceren First Try END");
            e.printStackTrace();
        }
    }
}

package Array;

public class PassArrayToMethod {

    public static void findMin(int arrayOne[]) {
        int min = arrayOne[0];
        for (int i = 1; i < arrayOne.length; i++) {
            if (min > arrayOne[i]) {
                min = arrayOne[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
    public static int[] getArray(){
        return new int[]{58,54,22,246,63,2,74};
    }

    public static void main(String[] args) {
        PassArrayToMethod pass = new PassArrayToMethod();
        int arrayTest[] = {12, 19, 20, 15, 8};
        pass.findMin(arrayTest);

        int arrayThree[]= pass.getArray();
        System.out.println(arrayThree[3]);
    }
}

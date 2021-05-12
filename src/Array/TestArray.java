package Array;

public class TestArray {
    public static void main(String[] args) {
        int arrayOne[] = new int[10];
        arrayOne[0] = 10;
        arrayOne[1] = 11;
        arrayOne[2] = 12;
        arrayOne[3] = 13;
        arrayOne[4] = 14;
        arrayOne[5] = 15;
        arrayOne[6] = 16;
        arrayOne[7] = 17;
        System.out.println(arrayOne[4]);
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }
        int arrayTwo[] = {10, 20, 30, 40, 50, 60};
        System.out.println("Size of Second Array is: " + arrayTwo.length);
    }
}

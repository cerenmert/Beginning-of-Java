public class FirstJavaProgram {

    public static void main(String[] args) {

        String str1 = "Geeks";
        String str2 = "forGeeks";
        int a = 200;
        int b = 300;
        System.out.println(str1 + str2);
        System.out.println(a + b + str1 + str2);
        System.out.println(str1 + str2 + a + b);

        int day = 5;

        switch (day) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            default -> System.out.println("yeeyy it's weekend!");
        }
        //****
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //****
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        //****
        int j=0;
        do{
            System.out.println(j);
        }while (j<0);

    }
}

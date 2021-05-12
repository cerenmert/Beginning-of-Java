package String;

public class StringIntro {
    public static void main(String[] args) {
        String name1 = "Ceren Mert";
        String name2 = "Ceren Mert";
        String name3 = "ceren mert";
        String city1 = new String("Barcelona");
        String city2 = new String("barcelona");
        String city3 = new String("Barcelona");
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name1.equalsIgnoreCase(name3)); // small or capital letter doesn't matter.
        System.out.println(city1.equals(city2));
        System.out.println(city1.equals(city3));
        System.out.println(city1.equalsIgnoreCase(city2));
        System.out.println(name1 == name2);
        System.out.println(city1 == city2);
        //city1 and city2 are different object, so they are allocating a specific memory in JVM.
        //So they both have their references inside the JVM. That's why comparison operator is returning false.
        //Because comparison operator compares the references.
    }
}

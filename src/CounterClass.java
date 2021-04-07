public class CounterClass {

    //static members of class belongs to the class itself instead of the object of class.
    //non-static members being accessed on the object of class.
    //so every time when we create a new object, this objects are basically created in the heap memory.
    //so static members are memory efficient more than non-static members.
    //because they will allocate in the memory once!

    int i = 0;
    static int j = 0;

    public CounterClass(){
        i++;
        j++;
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
        //in here we can see, j is always increase but i is always same, because i is not related to the class
        // i is related to the class object, but j is related to the class itself. j is initialized inside the memory of class
        //when we increment the j, it's increment itself; but i is increment itself but inside the object.
    }

    public static void main(String args[]) {
        //when we're creating the object of our class, this class is being loaded by the classloader in java.
        //and when java classloader load the class, it will initialize all the things which is present inside
        //the class, and attached these things to the object of the class
        //so, we're not getting any error in this way for variable i
        //but we don't need this for variable j. It's already declared as static!
        CounterClass counter1 = new CounterClass();
        CounterClass counter2 = new CounterClass();
        CounterClass counter3 = new CounterClass();
//        System.out.println(counter1.i);
//
//        System.out.println(CounterClass.j);

        //https://www.oracle.com/technical-resources/articles/javase/classloaders.html
        //https://qastack.info.tr/programming/2424604/what-is-a-java-classloader
    }
}

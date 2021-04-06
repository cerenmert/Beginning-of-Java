public class CounterClass {

    //static members of class belongs to the class itself instead of the object of class.
    //non-static members being accessed on the object of class.
    //so every time when we create a new object, this objects are basically created in the heap memory.
    //so static members are memory efficient more than non-static members.
    //because they will allocate in the memory once!

    int i = 0;
    static int j = 0;

    public static void main(String args[]) {
        //when we're creating the object of our class, this class is being loaded by the classloader in java.
        //and when java classloader load the class, it will initialize all the things which is present inside
        //the class, and attached these things to the object of the class
        //so, we're not getting any error in this way for variable i
        //but we don't need this for variable j. It's already declared as static!
        CounterClass counterClass = new CounterClass();
        System.out.println(counterClass.i);
        System.out.println(CounterClass.j);

        //https://www.oracle.com/technical-resources/articles/javase/classloaders.html
        //https://qastack.info.tr/programming/2424604/what-is-a-java-classloader
    }
}

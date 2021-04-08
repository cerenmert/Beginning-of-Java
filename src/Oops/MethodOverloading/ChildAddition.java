package Oops.MethodOverloading;

import Oops.MethodOverloading.Addition;

public class ChildAddition extends Addition {

    public static void main(String[] args) {
        Addition add= new Addition();
        add.addValues(8,9);
        add.addValues(10,11,12);

        double d= add.addValues(10.68,13.43);
        System.out.println(d);
    }
}

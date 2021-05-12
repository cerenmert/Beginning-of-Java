package IteratorInJavaCollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInterface {
    public static void main(String[] args) {
        // Creating an empty Vector
        Vector vector= new Vector();

        // Inserting elements to vector
        for(int i=0;i<10;i++){
            vector.addElement(i);
        }
        // Displaying the Vector
        System.out.println(vector);

        // Enumeration object can be created by calling elements() method present in the Vector class.
        // Creating an empty enumeration to store/retrieve the elements one by one
        Enumeration enumeration = vector.elements();

        //Displaying the Enumeration but first check the next element availability
        while (enumeration.hasMoreElements()) {
            // moving cursor to next element
            int i = (Integer) enumeration.nextElement();
            System.out.print(i + " ");
            //System.out.println(enumeration.nextElement());
        }

    }
}

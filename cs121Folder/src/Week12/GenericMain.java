package Week12;

import java.util.ArrayList;


public class GenericMain {
    public static void main(String[] args){
        GenericMethods generic = new GenericMethods();
         ArrayList<Integer> intArray = new ArrayList<>();
         intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);

        ArrayList<Double> doubleArray = new ArrayList<>();
        doubleArray.add(1.1);
        doubleArray.add(2.2);
        doubleArray.add(3.3);
        doubleArray.add(4.4);
        doubleArray.add(5.5);

        ArrayList<Character> charArray = new ArrayList<>();
        charArray.add('A');
        charArray.add('B');
        charArray.add('C');
        charArray.add('D');
        charArray.add('E');

        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Alpha");
        stringArray.add("Beta");
        stringArray.add("Gamma");
        stringArray.add("Delta");
        stringArray.add("Epsilon");



        System.out.print("Integer array: ");
        generic.printArrayList(intArray);

        System.out.print("Double array: ");
        generic.printArrayList(doubleArray);

        System.out.print("Char array: ");
        generic.printArrayList(charArray);

        System.out.print("String array: ");
        generic.printArrayList(stringArray);
    }
    }

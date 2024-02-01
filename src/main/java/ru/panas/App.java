package ru.panas;

import ru.panas.customList.MyArrayList;
import ru.panas.sort.CustomQuickSort;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        CustomQuickSort<String> quickSort = new CustomQuickSort<>();
        MyArrayList<String> arrayList = new MyArrayList<>();

        arrayList.add("7");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");

        System.out.println("Actual arrayList: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " + arrayList.get(i));
        }
        System.out.println();

        System.out.println("Index of 2 (): " + arrayList.indexOf("2"));
        arrayList.set(0, "9");
        System.out.println("Set by index (9): " + arrayList.get(0));

        quickSort.sort(arrayList, arrayList.size());

        System.out.println("ArrayList after quick sort: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " + arrayList.get(i));
        }
        System.out.println();

        System.out.println("Size of array (7): " + arrayList.size());
        System.out.println("Get element of index 6 (9): " + arrayList.get(6));

        System.out.println("Remove by value (1): " + arrayList.remove("1"));
        System.out.println("List after remove by value (1) ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " + arrayList.get(i));
        }
        System.out.println();

        arrayList.clear();
        System.out.println("List after clear:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " + arrayList.get(i));
        }
        System.out.println();
        System.out.println("Size of array: " + arrayList.size());

    }
}

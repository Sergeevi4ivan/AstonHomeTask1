package ru.panas.sort;

import ru.panas.customList.MyArrayList;

/**
 * This is custom realisation of quick sort
 * for custom realisation array list.
 * This realisation can sort any types of Objects in custom array list.
 * @author Ivan Panasenko
 */
public interface CustomSort<T extends Comparable<T>> {

    /**
     * Method sorts in a natural order
     * @param array custom array list for sorting
     * @param length size of array
     */
     void sort(MyArrayList<T> array, int length);
}

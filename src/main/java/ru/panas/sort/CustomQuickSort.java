package ru.panas.sort;

import ru.panas.customList.MyArrayList;

/**
 * This is custom realisation of quick sort
 * for custom realisation array list.
 * This realisation can sort any types of Objects in custom array list.
 * @author Ivan Panasenko
 */

public class CustomQuickSort<T extends Comparable<T>> implements CustomSort<T>{

    /**
     * Method sorts in a natural order
     * @param array custom array list for sorting
     * @param length size of array
     */
    @Override
    public void sort(MyArrayList<T> array, int length) {

        quickSort(array, 0, length - 1);
    }

    private void quickSort(MyArrayList<T> array, int from, int to) {
        if (from < to) {
            int divideIndex = partition(array, from, to);

            quickSort(array, from, divideIndex - 1);

            quickSort(array, divideIndex, to);
        }
    }

    private int partition(MyArrayList<T> array, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        T pivot = array.get(from + (to - from) / 2);

        while (leftIndex <= rightIndex) {
            while (array.get(leftIndex).compareTo(pivot) < 0) {
                leftIndex++;
            }

            while (array.get(rightIndex).compareTo(pivot) > 0) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private void swap(MyArrayList<T> array, int index1, int index2) {
        T temp = (T) array.get(index1);
        array.set(index1, array.get(index2));
        array.set(index2, temp);
    }


}

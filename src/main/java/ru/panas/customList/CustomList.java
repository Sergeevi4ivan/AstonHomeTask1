package ru.panas.customList;

/**
 * This is custom realisation of list
 * Methods of this list can add value to array,
 * get value by index, set value by index, show quantity of elements in the array,
 * remove element by value and remove all elements from array.
 * @author Ivan Panasenko
 */

public interface CustomList<T> {

    /**
     * Add new element to array. If size is too small, then it grow
     * @param value is the element for add to array
     */
     void add(T value);

    /**
     * Get element by index
     * return element of index from array
     * @param index is the index for get element by index
     */
     T get(int index);

    /**
     * Set element by index to array
     * @param index is the index for set element to array
     * @param value is the element for set value by index in array
     */
     void set(int index, T value);

    /**
     * return quantity of elements in the array
     * @return size of array
     */
     int size();

    /**
     * Method for remove element by value.
     * @param value is the element for remove
     * @return Return true if element is removed, else return false
     */
     boolean remove(T value);

    /**
     * Method for clear array. All elements equals null
     */
     void clear();
}

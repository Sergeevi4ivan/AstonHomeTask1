package ru.panas.customList;


/**
 * This is custom realisation of array list
 * Methods of this array list can add value to array, add value by index,
 * get value by index, set value by index, show quantity of elements in the array,
 * return index of value from array, remove element by index, remove element by value
 * and remove all elements from array.
 * @author Ivan Panasenko
 */

public class MyArrayList<T extends Comparable<T>> implements CustomList<T> {

    /**
     * Array of elements
     */
    private Object[] array;

    /**
     *quantity of elements in the array
     */
    private int size;

    /**
     * a variable for add (or remove) an element from array
     */
    private int index;

    /**
     * Default length of array
     */
    private static final int DEFAULT_CAPACITY = 16;

    /**
     * Constructor initializes an array with the default size
     */
    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Constructor initializes an array with the specified size
     * @param capacity length of array
     */
    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Size of array must be a positive number" );
        }
        array = new Object[capacity];
    }

    /**
     * Add new element to array. If size is too small, then it grow
     * @param value is the element for add to array
     */
    @Override
    public void add(T value) {
        if (index == array.length) {
            resize();
        }
        array[index] = value;
        index++;
        size++;
    }

    /**
     * Add new element to array by index. If size is too small, then it grow
     * @param value is the element for add to array
     * @param index is the index for add element to array
     * @return if the element added to array method return true, else false
     */
    public boolean add(int index, T value) {

        checkIndex(index);
        if (index >= array.length) {
            resize();
        }
        System.arraycopy(array, index, array, index + 1, this.index - index);
        array[index] = value;
        this.index++;
        size++;

        return true;
    }

    /**
     * Get element by index
     * return element of index from array
     * @param index is the index for get element by index
     */
    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    /**
     * Set element by index to array
     * @param index is the index for set element to array
     * @param value is the element for set value by index in array
     */
    @Override
    public void set(int index, T value) {

        checkIndex(index);
        array[index] = value;
    }

    /**
     * return quantity of elements in the array
     * @return size of array
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Method for get index of value from array.
     * @param value is searching element of array
     * @return index of value from array. If value is not exist, then method return -1
     */
    public int indexOf(T value) {
        int result = -1;
        for (int i = 0; i < index; i++) {
            if (array[i].equals(value)) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * Method for remove element by index.
     * @param index is the index of element for remove
     * @return Return true if element is removed, else return false
     */
    public boolean remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, this.index - index);
        size--;
        this.index--;

        return true;
    }

    /**
     * Method for remove element by value.
     * @param value is the element for remove
     * @return Return true if element is removed, else return false
     */
    @Override
    public boolean remove(T value) {
        Object[] tempArray = this.array;
        for (int i = 0; i < size; i++) {
            if (tempArray[i].equals(value)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Method for clear array. All elements equals null
     */
    @Override
    public void clear() {

        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        this.size = 0;
    }

    /**
     * Method for grow array if it too small for add elements
     */
    private void resize() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, index);
        array = newArray;
    }

    /**
     * Method check whether the array contains an index
     * @param index is the element being checked
     * @throws IllegalArgumentException if the array does not contain an index
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= this.index) {
            throw new IllegalArgumentException("Index does not exist in the array");
        }

    }

}

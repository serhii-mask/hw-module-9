package myArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private int capacity = 0;
    private final int CAPACITY = 16;
    private Object[] array;

    public MyArrayList() {
        capacity = CAPACITY;
        array = new Object[capacity];
    }

    public void add(Object o) {
        if (size >= capacity) {
            capacity = capacity * 2;
            Object[] newArray = Arrays.copyOf(array, capacity);
            array = newArray;
        }
        array[size++] = o;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", out of bounds for length: " + size());
        }

        return (E) array[index];
    }

    public E remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", out of bounds for length: " + size());
        }

        Object[] newArray = new Object[capacity];
        Object removeValue = get(index);
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (i != index) {
                newArray[count] = array[i];
                array[i] = null;
                count++;
            } else {
                i++;
                newArray[count] = array[i];
                array[i] = null;
                count++;
            }
        }
        array = newArray;
        size--;

        return (E) removeValue;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
}

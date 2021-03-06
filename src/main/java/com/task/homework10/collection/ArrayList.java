package com.task.homework10.collection;

import java.util.Iterator;

public class ArrayList<E> implements List<E> {

    private int maxSize;
    private Object[] array;
    private int items;

    public ArrayList() {
        this(10);
    }

    public ArrayList(int maxSize) {
        init(maxSize);
    }

    @Override
    public int size() {
        return items;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void add(int index, E e) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + items);
        }
        if (items >= maxSize) grow();
        for (int i = items - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = e;
        items++;
    }

    @Override
    public void add(E e) {
        if (items >= maxSize) {
            grow();
        }
        array[items++] = e;
    }

    private void grow() {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity * 2;

        Object[] newArray = new Object[newCapacity];


        System.arraycopy(array, 0, newArray, 0, items);

        maxSize = newCapacity;
        array = newArray.clone();
    }


    @Override
    public void set(int index, E e) {
        rangeCheck(index);
        array[index] = e;
    }

    @Override
    public E getByIndex(int index) {
        rangeCheck(index);

        return (E) array[index];
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);

        E temp = (E) array[index];

        items--;

        for (int i = index; i < items; i++) {
            array[i] = array[i + 1];
        }

        return temp;
    }

    private void rangeCheck(int index) {
        if (index >= items || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + items);
    }



    @Override
    public void clean() {
        init(10);
    }

    private void init(int maxSize) {
        this.maxSize = maxSize;
        this.items = 0;
        this.array = new Object[maxSize];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < items && array[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) array[currentIndex++];
            }

            @Override
            public void remove() {
                if (isEmpty() || currentIndex > items - 1 || currentIndex < 0) {
                    return;
                }

                items--;

                for (int i = currentIndex; i < items; i++) {
                    array[i] = array[i + 1];
                }
            }
        };
    }
}

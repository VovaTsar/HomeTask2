package com.task.homework10.collection;

public interface List<E> extends Iterable<E> {
    int size();

    boolean isEmpty();

    void add(int index, E e);

    void add( E e);
    void set(int index, E e);


    E getByIndex(int index);

    E remove(int index);

    void clean();

}

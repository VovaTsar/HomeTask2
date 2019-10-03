package com.task.homework10.collection;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {
    int size;
    Link first;
    Link last;

    public LinkedList() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size ()== 0;
    }

    @Override
    public void add(int index, E e) {
        rangeCheck(index);

        Link current = getLink(index);

        Link newLink = new Link(e);

        if (current == first) {
            first = newLink;
        } else {
            current.previous.next = newLink;
        }
        newLink.previous = current.previous;
        newLink.next = current;
        current.previous = newLink;

        size++;
    }

    @Override
    public void add(E e) {
        Link newLink = new Link(e);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }

        newLink.previous = last;
        last = newLink;

        size++;
    }

    @Override
    public void set(int index, E e) {
        rangeCheck(index);
        Link current = getLink(index);
        current.data = e;
    }

    @Override
    public E getByIndex(int index) {
        rangeCheck(index);
        Link current = getLink(index);
        return (E) current.data;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);

        Link current = getLink(index);

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        size--;

        return (E) current.data;
    }

    @Override
    public void clean() {
        for (int i = 0; i <size ; i++) {
            remove(0);
        }
        first=null;
        last=null;
        size=0;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>(){

            Link current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                Link temp = current;
                current = current.next;
                return (E) temp.data;
            }

            @Override
            public void remove() {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                current = current.previous;
                size--;
            }
        };
        return iterator;
    }

    private void rangeCheck(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private Link getLink(int index) {
        Link current = first;
        if (index < size / 2) {
            while (index > 0) {
                current = current.next;
                index--;
            }
        } else {
            current = last;
            index = size - index - 1;
            while (index > 0) {
                current = current.previous;
                index--;
            }
        }
        return current;
    }


    class Link {
        private Object data;
        private Link previous;
        private Link next;

        public Link(Object data) {
            this.data = data;
            previous = null;
            next = null;
        }

        @Override
        public String toString() {
            return (data + " ");
        }
    }
}

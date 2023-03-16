package day9.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        elements = (E[]) new Object[size];
    }

    public void add(E a) {
        ensureCap();
        elements[size++] = a;
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        MyList<E> clone = new MyList<>(size);
        for (E s : elements) {
            if (s != null) {
                clone.add(s);
            }
        }
        return clone.elements;
    }

    public boolean contains(E o) {
        for (E x : elements) {
            if (o.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public void add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCap();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
        }else {
            System.out.println("Phan tu nam truoc chua co du lieu");
        }
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    private void ensureCap() {
        if (size > elements.length) {
            int biggerSize = size * 2;
            elements = Arrays.copyOf(elements, biggerSize);
        }
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        return null;
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}

package ru.otus.myArrayList;

import java.util.*;

public class MyArrayList<T> implements List<T> {

    private T[] array;
    private int size;

    public MyArrayList (T ... elements) {
        size = elements.length;
        array = (T[]) elements.clone();
    }

    public int size() {//throw new RuntimeException("Needed!!! size()");
        return this.size;
    }

    public boolean isEmpty() {throw new RuntimeException("Needed!!! isEmpty() ");
       // return false;
    }

    public boolean contains(Object o) {throw new RuntimeException("Needed!!! contains(Object o)");
        //return false;
    }

    public Iterator<T> iterator() {
        ListIterator myListIterator = this.listIterator();
        return myListIterator;
    }

    public Object[] toArray() {//throw new RuntimeException("Needed!!! Object[] toArray()");
        return array.clone();
    }

    public <T1> T1[] toArray(T1[] a) {throw new RuntimeException("Needed!!! T1[] toArray(T1[] a)");
       // return null;
    }

    public boolean add(T t) {

        size++;
        T[] newArray = (T[])(new Object[size]);
        for(int i = 0; i < size - 1; i++) {
            newArray[i] = array[i];
        }
        newArray[size - 1] = t;
        array = newArray;
        return true;
    }

    public boolean remove(Object o) {throw new RuntimeException("Needed!!! remove(Object o)");
       // return false;
    }

    public boolean containsAll(Collection<?> c) {throw new RuntimeException("Needed!!! containsAll(Collection<?> c)");
       // return false;
    }

    public boolean addAll(Collection<? extends T> c) {throw new RuntimeException("Needed!!! addAll(Collection<? extends T> c)");
       // return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {throw new RuntimeException("Needed!!! addAll(int index, Collection<? extends T> c)");
       // return false;
    }

    public boolean removeAll(Collection<?> c) {throw new RuntimeException("Needed!!! removeAll(Collection<?> c)");
       // return false;
    }

    public boolean retainAll(Collection<?> c) {throw new RuntimeException("Needed!!! retainAll(Collection<?> c)");
       // return false;
    }

    public void clear() {throw new RuntimeException("Needed!!! clear()");

    }

    public T get(int index) { return array[index];
      //  return null;
    }

    public T set(int index, T element) {//throw new RuntimeException("Needed!!!T set(int index, T element)");
        return  array[index] = element;
    }

    public void add(int index, T element) {throw new RuntimeException("Needed!!!add(int index, T element)");

    }

    public T remove(int index) {throw new RuntimeException("Needed!!!T remove(int index)");
      //  return null;
    }

    public int indexOf(Object o) {throw new RuntimeException("Needed!!!int indexOf(Object o)");
       // return 0;
    }

    public int lastIndexOf(Object o) {throw new RuntimeException("Needed!!!int lastIndexOf(Object o)");
      //  return 0;
    }

    public ListIterator<T> listIterator() {
        return new MyArrayIterator(array);
    }


    public ListIterator<T> listIterator(int index) {throw new RuntimeException("Needed!!!ListIterator<T> listIterator(int index)");
      //  return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {throw new RuntimeException("Needed!!!List<T> subList(int fromIndex, int toIndex)");
       // return null;
    }

    private class MyArrayIterator implements Iterator<T>, ListIterator<T> {

        int current = -1;
        List<T> list;

        MyArrayIterator(T[] list) {
            this.list = Arrays.asList(list);
        }

        MyArrayIterator(T[] list, int index) {
            this.list = Arrays.asList(list);
            this.current = index;
        }

        @Override
        public boolean hasNext() {
            return  current < list.size() - 1;
        }

        @Override
        public T next() {
            if (hasNext()) {
                current++;
                return list.get(current);
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean hasPrevious() {
            return current > 0 && list.size() > 0;
        }

        @Override
        public T previous() {
            if (hasPrevious()) {
                current--;
                return list.get(current);
            }
            throw new NoSuchElementException();
        }

        @Override
        public int nextIndex() {
            if (hasNext()) {
                return (current + 1);
            }
            else return -1;
        }

        @Override
        public int previousIndex() {
            if (hasPrevious()) {
                return (current - 1);
            }
            else return -1;
        }

        @Override
        public void remove() {
            list.remove(current);
        }

        @Override
        public void set(T t) {
            list.set(current, t);
        }

        @Override
        public void add(T t) {
            list.add(t);
        }
    }
}

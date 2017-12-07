package ru.otus.HW31;

import static java.util.Collections.*;
import ru.otus.myList.MyArrayList;

public class Main {
    public static void main (String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>("1", "2");
        myArrayList.set(1,"123");
        String s=myArrayList.get(1);System.out.println(s);

        addAll(myArrayList, "First", "Second", "Third");
        System.out.println(myArrayList);

        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        addAll(myArrayList2, "3", "2", "1");
        copy(myArrayList, myArrayList2);
        System.out.println(myArrayList2);

        sort(myArrayList2);
        System.out.println(myArrayList2);
    }
}

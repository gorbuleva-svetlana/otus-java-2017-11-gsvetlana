package ru.otus.HW31;

import java.util.*;
import ru.otus.myArrayList.MyArrayList;


public class Main {
    public static void main (String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>(new Integer[]{1,99});

        System.out.println("--Method addAll--");

        Collections.addAll(myArrayList,7,88);
        ListIterator myIt = myArrayList.listIterator();
        while(myIt.hasNext()){
            System.out.println(myIt.next());
        }

        System.out.println("--Method sort--");

        Collections.sort(myArrayList);
        ListIterator myIt2 = myArrayList.listIterator();
        while(myIt2.hasNext()){
            System.out.println(myIt2.next());
        }

        System.out.println("--Method copy--");

        MyArrayList<Integer> myArrayListTarget = new MyArrayList<>(new Integer[]{111,444,333,666,78});

        Collections.copy( myArrayListTarget ,myArrayList);
        ListIterator myIt3 = myArrayListTarget.listIterator();
        while(myIt3.hasNext()){
            System.out.println(myIt3.next());
        }
    }
}

package org.eddie.test.generic;


import javax.swing.*;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"mary", "had", "a", "little", "zamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        String middle = ArrayAlg.<String>getMiddle(words);
        String middle1 = ArrayAlg.getMiddle(words);
        System.out.println(middle);
        System.out.println(middle1);
        ArrayList<String> a = new ArrayList<>();
        Integer[] s = a.toArray(new Integer[10]);
        System.out.println(ArrayAlg.getMiddle(words));
        ArrayAlg.getMiddle("hello", 0, 1729, null);
        System.out.println(Pair.makePair(String::new).getFirst() + "1");
        IndexOutOfBoundsException ex = Pair.doWork(new IndexOutOfBoundsException());
        LocalDate now = LocalDate.now();
        Pair<?> pair2 = new Pair<>();
        Object o = pair2.getFirst();
    }

}

class ArrayAlg {
    public static <T extends Comparable<T>> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
    
    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];
        for (int i = 1; i < a.length; i++)
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];
        return smallest;
    }
}

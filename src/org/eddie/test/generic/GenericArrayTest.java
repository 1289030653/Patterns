package org.eddie.test.generic;

import java.time.LocalDate;

public class GenericArrayTest {
    public static void main(String[] args) {
        Pair<String>[] table = new Pair[10];
        //Pair<String>[] table = new Pair<String>[10];//error,generic array creation
        Object[] objarray = table;
        //objarray[0] = "hello";

        Pair<LocalDate>[] table1 = (Pair<LocalDate>[]) new Pair<?>[10];
        table1[0] = new Pair<LocalDate>();
        Pair a = new Pair<Integer>();
        table1[1] = a;
        a.setFirst(Integer.valueOf(1));
        LocalDate b = table1[1].getFirst();
        System.out.println(b);
    }
}

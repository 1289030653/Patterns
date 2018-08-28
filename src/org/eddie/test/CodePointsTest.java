package org.eddie.test;

import java.time.LocalDateTime;
import java.util.Arrays;

public class CodePointsTest {
    public static void main(String[] args) {
        String s = "😊笑";
        System.out.println(s.length());
        System.out.println(s.codePointCount(0, s.length()));
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointAt(2));
        int[] arr = s.codePoints().toArray();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(new String(arr, 0, 2));
        System.out.println(s.charAt(0));
        System.out.println(Arrays.toString(new int[]{1,2,3}));
        LocalDateTime time = LocalDateTime.now();
        time.getDayOfMonth();


    }
}

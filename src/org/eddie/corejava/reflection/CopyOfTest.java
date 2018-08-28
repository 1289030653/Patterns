package org.eddie.corejava.reflection;

import java.lang.reflect.Array;

public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 3, 4};
        a = (int[]) copyOf(a, 10);
        System.out.println(a.length);
    }

    public static Object copyOf(Object a, int newLength)
    {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}

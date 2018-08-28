package org.eddie.test.generic;

import java.util.function.Supplier;

public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public static <T> Pair<T> makePair(Supplier<T> constr) {
        return new Pair<>(constr.get(), constr.get());
    }

    public static <T> Pair<T> makePair(Class<T> cl) {
        try {
            return new Pair<>(cl.newInstance(), cl.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

//    public boolean equals(T t) {
//        return false
//    }

    public T[] toArray() {
        Object[] array = {first, second};
        return (T[]) array;
    }

    public static <T extends Throwable> T doWork(T t) throws T  {
        try {
            System.out.println("hello");
            return t;
        } catch (Throwable realCause) {
            t.initCause(realCause);
            throw t;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }
    public void setSecond(T newValue) {
        second = newValue;
    }
}

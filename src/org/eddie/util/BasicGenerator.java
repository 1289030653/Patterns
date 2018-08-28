package org.eddie.util;

import java.util.function.Supplier;

public class BasicGenerator<T> implements Generator<T> {
    private Supplier<T> su;

    public BasicGenerator(Supplier<T> su) {
        this.su = su;
    }
    @Override
    public T next() {
        return su.get();

    }
    public static <T> Generator<T> create(Supplier<T> su) {
        return new BasicGenerator<T>(su);
    }
}

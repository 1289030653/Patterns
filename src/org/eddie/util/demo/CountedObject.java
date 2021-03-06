package org.eddie.util.demo;

import org.eddie.util.BasicGenerator;
import org.eddie.util.Generator;

public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() {
        return id;
    }
    public String toString() {
        return "CountedObject " + id;
    }

    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject::new);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}

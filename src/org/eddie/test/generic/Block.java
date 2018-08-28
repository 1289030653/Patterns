package org.eddie.test.generic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Block {
    public abstract void body() throws Exception;
    public Thread toThread() {
        return new Thread() {
            public void run() {
                try {
                    body();
                } catch (Throwable e) {
                    Block.<RuntimeException>throwAs(e);
                }
            }
        };
    }
    @SuppressWarnings("unchecked")
    public static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;
    }

    public static void main(String[] args) {
        new Block() {
            @Override
            public void body() throws Exception {
                Scanner in = new Scanner(new File("afasd"), "UTF-8");
                while (in.hasNext()) {
                    System.out.println(in.next());
                }
            }
        }.toThread().start();
    }

}

class Block1 {
    public Thread toThread() {
        return new Thread() {
            public void run() {
                Scanner in = null;
                try {
                    in = new Scanner(new File("afasd"), "UTF-8");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                while (in.hasNext()) {
                    System.out.println(in.next());
                }

            }
        };
    }
}

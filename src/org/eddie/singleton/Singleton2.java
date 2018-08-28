package org.eddie.singleton;

/**
 * 懒汉式，线程安全，加锁影响效率
 * @author eddie
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance;
	
	private Singleton2() {}
	
	public static synchronized Singleton2 getInstance() {
		return instance == null ? instance = new Singleton2() : instance;
	}

}

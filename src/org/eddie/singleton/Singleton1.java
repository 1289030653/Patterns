package org.eddie.singleton;

/**
 * 懒汉式，线程不安全
 * @author eddie
 *
 */
public class Singleton1 {
	
	private static Singleton1 instance;
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return null == instance ? instance = new Singleton1() : instance;
	}

}

package org.eddie.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		SingleObject instance = SingleObject.getInstance();
		instance.showMessage();
		
		//懒汉式，线程不安全
		Singleton1 instance1 = Singleton1.getInstance();
		System.out.println(instance1);
		
		Singleton1 instance2 = Singleton1.getInstance();
		System.out.println(instance2);
		System.out.println(instance1.equals(instance2));
		
		//懒汉式，线程安全，加锁影响效率
		Singleton2 instance3 = Singleton2.getInstance();
		Singleton2 instance4 = Singleton2.getInstance();
		System.out.println(instance3 == instance4);
	}
}

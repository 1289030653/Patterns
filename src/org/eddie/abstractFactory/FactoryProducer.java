package org.eddie.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if ("shape".equals(factory)) {
			return new ShapeFactory();
		} else if ("color".equals(factory)) {
			return new ColorFactory();
		} else {
			return null;
		}
	}

}

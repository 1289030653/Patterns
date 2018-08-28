package org.eddie.abstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		colorFactory.getColor("red").fill();
		
		FactoryProducer.getFactory("shape").getShape("circle").draw();

	}

}

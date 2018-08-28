package org.eddie.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		Shape rec = shapeFactory.getShape("rectangle");
		Shape square = shapeFactory.getShape("square");
		
		circle.draw();
		rec.draw();
		square.draw();
	}

}

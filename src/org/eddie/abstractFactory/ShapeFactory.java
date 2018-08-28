package org.eddie.abstractFactory;

import org.eddie.factory.Circle;
import org.eddie.factory.Rectangle;
import org.eddie.factory.Shape;
import org.eddie.factory.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		switch (shape) {
		    case "circle" : return new Circle();
		    case "rectangle": return new Rectangle();
		    case "square": return new Square();
			default: return null;
		}
	}

}

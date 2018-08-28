package org.eddie.abstractFactory;

import org.eddie.factory.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		switch(color) {
		case "red": return new Red();
		case "blue": return new Blue();
		case "green": return new Green();
		default: return null;
		}
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}

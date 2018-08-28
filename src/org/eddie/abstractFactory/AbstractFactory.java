package org.eddie.abstractFactory;

import org.eddie.factory.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);

}

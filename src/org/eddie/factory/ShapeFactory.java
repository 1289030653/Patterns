package org.eddie.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
	    switch (shapeType) {
	        case "circle" :
	            return new Circle(); 
	        case "rectangle":
	        	    return new Rectangle();
	        case "square":
	        	    return new Square();
	        default:
	        	    return null;
	    }
	}
}

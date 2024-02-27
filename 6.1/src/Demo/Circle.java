package Demo;

public class Circle extends Shape{
	protected double radius;
	 public Circle(String color, boolean filled, double radius) {
	        super(color, filled);
	        this.radius = radius;
	    }
	 @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	 @Override
	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }

	    @Override
	    public String toString() {
	        return "Circle [radius=" + radius + ", " + super.toString() + "]";
	    }
	}
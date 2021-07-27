package shape;

public class Circle extends Shape {

	public Double radius;
	
	public Circle() {
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * this.radius * this.radius;
	}

	
	
}

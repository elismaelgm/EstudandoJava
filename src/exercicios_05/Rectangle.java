package exercicios_05;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return 2 * height + 2 * width;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}

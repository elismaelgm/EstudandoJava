package shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			
			if (shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}

		System.out.println();
		
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
			System.out.println(shape.toString());
		}
		
		sc.close();
	}

}

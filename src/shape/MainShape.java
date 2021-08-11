package shape;


public class MainShape {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		List<Shape> list = new ArrayList<Shape>();
//		
//		System.out.print("Enter the number of shapes: ");
//		int n = sc.nextInt();
//				
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Shape #" + i + " data: ");
//			System.out.print("Rectangle or Circle (r/c)? ");
//			char shape = sc.next().charAt(0);
//			
//			System.out.print("Color (BLACK/BLUE/RED): ");
//			String color = sc.next();
//			
//			if (shape == 'r') {
//				System.out.print("Width: ");
//				double width = sc.nextDouble();
//				System.out.print("Height: ");
//				double height = sc.nextDouble();
//				list.add(new Rectangle(Color.valueOf(color), width, height));
//			} else {
//				System.out.print("Radius: ");
//				double radius = sc.nextDouble();
//				list.add(new Circle(Color.valueOf(color), radius));
//			}
//		}
//
//		System.out.println();
//		
//		System.out.println("SHAPE AREAS: ");
//		for (Shape shape : list) {
//			System.out.println(shape.toString());
//		}
//		
//		sc.close();
	}

}

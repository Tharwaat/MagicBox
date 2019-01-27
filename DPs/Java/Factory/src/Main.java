import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.print("Enter the shape you want: ");
		
		ShapeFactory shaper = new ShapeFactory();
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		Shape shape = shaper.getShape(name);
		shape.CalculateArea();
		shape.PrintArea();
	}
}

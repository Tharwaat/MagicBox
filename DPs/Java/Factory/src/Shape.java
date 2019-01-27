
abstract class Shape {
	protected double area;
	
	abstract double CalculateArea();
	
	public void PrintArea() {
		System.out.println("Area equals = " + this.area);
	}
	
}

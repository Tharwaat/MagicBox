
class Circle extends Shape {
	
	double Pi = 3.14;
	double Radius = 3.0;
	
	@Override
	double CalculateArea() {
		this.area = this.Pi * this.Radius * this.Radius;
		return this.area;
	}
	
}

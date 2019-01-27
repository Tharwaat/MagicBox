
class Square extends Shape {
	double Length = 4.0;
	
	@Override
	double CalculateArea() {
		this.area = this.Length * this.Length;
		return this.area;
	}
}

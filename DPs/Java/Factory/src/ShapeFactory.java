
class ShapeFactory {
	
	public Shape getShape(String shapeName) {
		
		shapeName = shapeName.toLowerCase();
		
		if(shapeName == null) return null;
		else if(shapeName.equals("circle")) return new Circle();
		else if(shapeName.equals("square")) return new Square();
		else System.out.println("Entered shape is not defined!.");
		
		return null;
	}
}


public class Circle implements Shape{
	double radius;
	public double computeArea() {
		return radius*radius*Math.PI;
		
	}
	public double computeCircumference() {
		return radius * 2 * Math.PI;
	}
	public static void main(String[] args) {
		Circle C = new Circle();
		C.radius = Double.parseDouble(args[0]);
		System.out.println("Area = "+C.computeArea());
		System.out.println("Circumference = "+C.computeCircumference());

	}

}

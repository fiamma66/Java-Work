
public class Rectangle implements Shape{
	double length,height;
	public double computeArea() {
		return length*height;
	}
	public double computeCircumference() {
		return (length+height)*2;
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.length = Double.parseDouble(args[0]);
		rec.height = Double.parseDouble(args[1]);
		System.out.println("Area = "+rec.computeArea());
		System.out.println("Circumference = "+rec.computeCircumference());


	}

}

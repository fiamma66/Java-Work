
public class Distance {
	private int feet;
	private int inch;
	private static final int INCH_PER_FEET = 12;
	Distance(int feet,int inch) throws OverInchException {
		if(inch >=Distance.INCH_PER_FEET) { //應加在前面 錯誤時直接不做後續動作
			throw new OverInchException("Over Inch Exception!",inch);
		}
		this.feet = feet;
		this.inch = inch;
		
	}
	public void display() {
		System.out.println("Feet = "+feet);
		System.out.println("Inch = "+inch);

	}
	
	public int getFeet() {
		return feet;
	}

/*	public void setFeet(int feet) {
		this.feet = feet;
	}*/ //只在NEW時輸入值 不須使用Setter

	public int getInch() {
		return inch;
	}

	/*public void setInch(int inch) {
		this.inch = inch;
	}*/ ////只在NEW時輸入值 不須使用Setter
	
	
	
	public static void main(String[] args) {
		try{
			Distance d1 = new Distance(5,6);
			d1.display();
			Distance d2 = new Distance(5,14);
			d2.display();
			
		} catch (OverInchException e) {
			System.err.println(e.getMsg() + " Inch must less than " + e.getInch());

		}
		

	}

}

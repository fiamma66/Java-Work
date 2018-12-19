
public class Distance {
	private int feet;
	private int inch;
	private static final int INCH_PER_FEET = 12;
	Distance(int feet,int inch) throws OverInchException {
		if(inch >=Distance.INCH_PER_FEET) { //���[�b�e�� ���~�ɪ�����������ʧ@
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
	}*/ //�u�bNEW�ɿ�J�� �����ϥ�Setter

	public int getInch() {
		return inch;
	}

	/*public void setInch(int inch) {
		this.inch = inch;
	}*/ ////�u�bNEW�ɿ�J�� �����ϥ�Setter
	
	
	
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


@SuppressWarnings("serial")
public class StackEmptyException extends Exception{
	private String e1;
	public StackEmptyException(String e1) {
		this.e1 = e1;
	}

	public String getE1() {
		return e1;
	}
	

}

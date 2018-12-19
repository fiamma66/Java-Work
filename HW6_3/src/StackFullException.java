
@SuppressWarnings("serial")
public class StackFullException extends Exception {
	private String e1;
	public StackFullException(String e1) {
		this.e1 = e1;
	}
	public String getE1() {
		return e1;
	}
	
}

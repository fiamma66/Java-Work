
@SuppressWarnings("serial")//暫時無法解說
public class OverInchException extends Exception {
	private String msg ;
	private int inch;
	OverInchException(String msg,int inch){
		this.msg = msg;
		this.inch = inch;
	}
	public String getMsg() {
		return msg;
	}
/*	public void setMsg(String msg) {
		this.msg = msg;
	}*/ ////只在NEW時輸入值 不須使用Setter
	public int getInch() {
		return inch;
	}
/*	public void setInch(int inch) {
		this.inch = inch;
	}
	*/ ////只在NEW時輸入值 不須使用Setter

}


@SuppressWarnings("serial")//�ȮɵL�k�ѻ�
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
	}*/ ////�u�bNEW�ɿ�J�� �����ϥ�Setter
	public int getInch() {
		return inch;
	}
/*	public void setInch(int inch) {
		this.inch = inch;
	}
	*/ ////�u�bNEW�ɿ�J�� �����ϥ�Setter

}

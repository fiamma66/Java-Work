import java.util.*;
import java.text.*;
public class CalenderDemo {
	public static String switchday(int n) {
		String result;
		switch (n) {
		
		case 1 : result = "��";break;
		case 2 : result = "�@";break;
		case 3 : result = "�G";break;	
		case 4 : result = "�T";break;
		case 5 : result = "�|";break;
		case 6 : result = "��";break;
		case 7 : result = "��";break;
		default : result = "Null";
		}
		
		return result;
	}

	public static String changeInt(int n) {
		String result;
		if(n<10) {
			result = "0"+Integer.toString(n);
		} else {
			result = Integer.toString(n);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		
		
		System.out.println("���ѬO"+year+"/"+month+"/"+day);
		System.out.println("���ѬO�P��"+CalenderDemo.switchday(day_of_week));//�Ĥ@��switch
		
		
		
		String[] days = {"��","�@","�G","�T","�|","��","��"};
		System.out.println("���ѬO�P��"+days[(day_of_week)-1]); //�ĤG�� �}�C
		
		//�ĤT�� �r�� �̦��Ĳv
		String sdays = "��@�G�T�|����";
		System.out.println("���ѬO�P��"+sdays.charAt(day_of_week-1));
		
		System.out.println("�ɶ��O"+hour+":"+minute+":"+second);

		System.out.println("�ɶ��O"+hour+":"+changeInt(minute)+":"+changeInt(second)); //�{���y���з�
		System.out.printf("�ɶ��O%d:%02d:%02d%n",hour,minute,second); //PrintF ���ܮ榡�L�X
		
		System.out.println("�ɶ��O"+hour
				+":"+((minute < 10) ? "0"+minute : minute)
				+":"+((second < 10) ? "0"+second : second)); //�T���B��l
		
		SimpleDateFormat df2 = new SimpleDateFormat("hh:mm:ss");
		Date nowDate = today.getTime();
		System.out.println("�ɶ��O"+df2.format(nowDate)); 




		
		
		
		

	}

}

import java.util.*;
import java.text.*;
public class CalenderDemo {
	public static String switchday(int n) {
		String result;
		switch (n) {
		
		case 1 : result = "日";break;
		case 2 : result = "一";break;
		case 3 : result = "二";break;	
		case 4 : result = "三";break;
		case 5 : result = "四";break;
		case 6 : result = "五";break;
		case 7 : result = "六";break;
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
		
		
		
		System.out.println("今天是"+year+"/"+month+"/"+day);
		System.out.println("今天是星期"+CalenderDemo.switchday(day_of_week));//第一種switch
		
		
		
		String[] days = {"日","一","二","三","四","五","六"};
		System.out.println("今天是星期"+days[(day_of_week)-1]); //第二種 陣列
		
		//第三種 字串 最有效率
		String sdays = "日一二三四五六";
		System.out.println("今天是星期"+sdays.charAt(day_of_week-1));
		
		System.out.println("時間是"+hour+":"+minute+":"+second);

		System.out.println("時間是"+hour+":"+changeInt(minute)+":"+changeInt(second)); //程式語言標準
		System.out.printf("時間是%d:%02d:%02d%n",hour,minute,second); //PrintF 改變格式印出
		
		System.out.println("時間是"+hour
				+":"+((minute < 10) ? "0"+minute : minute)
				+":"+((second < 10) ? "0"+second : second)); //三元運算子
		
		SimpleDateFormat df2 = new SimpleDateFormat("hh:mm:ss");
		Date nowDate = today.getTime();
		System.out.println("時間是"+df2.format(nowDate)); 




		
		
		
		

	}

}

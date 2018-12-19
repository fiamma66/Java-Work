import java.util.*;
import java.text.*;
public class DateFormatDemo {
	public static String whatTime(long n) {
		String result;
		long s,m,h,ms;
		ms = n%1000;
		s = n/1000%60;
		m = n/1000/60%60;
		h = n/1000/60/60;
		result = h+":"+m+":"+s+":"+ms;
		
		
		return result;
	}
	

	public static void main(String[] args) {
		long start = new java.util.Date().getTime();
		long start1 = System.currentTimeMillis();
		
		Calendar cal = new GregorianCalendar(1996,Calendar.MARCH,20);
		Date myDate = cal.getTime();
		int c_year = cal.get(Calendar.YEAR)-1911; //民國 = 西元 - 1911
		DateFormat df1 = DateFormat.getDateInstance();
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat df3 = new SimpleDateFormat("年M月d日");
		System.out.println(df1.format(myDate));
		System.out.println(df2.format(myDate));
		System.out.println(c_year + df3.format(myDate));
		
		long end = new java.util.Date().getTime();
		long end1 = System.currentTimeMillis();
		System.out.println("Time : "+ (end - start));
		System.out.println("Time : "+ (end1 - start1));
		
		long time = 5555555L;
		System.out.println("Time : "+whatTime(time));

		
	}

}

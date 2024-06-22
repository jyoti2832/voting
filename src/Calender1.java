import java.util.*;
public class Calender1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		Calendar cal=Calendar.getInstance();
		System.out.println("Calendar=>");
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println(gc.isLeapYear(2024));
	}

}

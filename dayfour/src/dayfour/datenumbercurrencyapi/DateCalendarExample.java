package dayfour.datenumbercurrencyapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendarExample {

	public static void main(String[] args) {
		//Convert Date to String 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String date = sdf.format(new Date());
		System.out.println(date);
		
		//Convert String to Date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString ="27-09-2022 10:09:56";
		Date date1 = null;
		try {
			date1 = sdf1.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date1);
		
		//Get current date time
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date2 = new Date();
		System.out.println(dateFormat.format(date2));
		
		//Convert Calendar to Date
		Calendar calendar = Calendar.getInstance();
		Date date3 = calendar.getTime();//Get current date time
		System.out.println(dateFormat.format(date3));
		
		//Simple Calendar Example
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		System.out.println(Calendar.DAY_OF_WEEK);
		Calendar cal = new GregorianCalendar(2022,9,27,10,21,58);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		System.out.println("year--"+year);
		System.out.println("month--"+month);
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfMonth--"+dayOfMonth);
		System.out.println("dayOfWeek--"+dayOfWeek);
		
		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= cal.get(Calendar.WEEK_OF_MONTH);

		int hour       = cal.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = cal.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = cal.get(Calendar.MINUTE);
		int second     = cal.get(Calendar.SECOND);
		int millisecond= cal.get(Calendar.MILLISECOND);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
			
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
		//Output will be week count in month
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//Set a date manually
		SimpleDateFormat sf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar c = new GregorianCalendar(2022,8,27,10,52,54);
		System.out.println(sf.format(c.getTime()));
		
		c.set(Calendar.YEAR,2021);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.MINUTE,58);
		System.out.println(sf.format(c.getTime()));
	}

}

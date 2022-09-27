package dayfour.datenumbercurrencyapi;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("Our first date is : " + date1);

		Date date2 = new Date(99999999999L);

		System.out.println("Our second date is : " + date2);

		Date date3 = new Date(999999999999L);

		System.out.println("Our third date is : " + date3);
			if(date1.after(date2)) {
				System.out.println("Our first date is after our second date.");
			}
			if(date2.before(date3)) {
				System.out.println("Our second date is before our third date");
			}
			
			System.out.println(date1.getTime());
			//hh:mm:ss
			
			//DateTimeFormatter dateTimeFormatter  = DateTimeFormatter.ofPattern("HH:mm:ss");
			//date1.;
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			System.out.println(sdf.format(date3));
			
			String formattedDate = sdf.format(date3);
			String[] dates =formattedDate.split(" ");
			for(String date : dates) {
				System.out.println(date);
			}
	}

}

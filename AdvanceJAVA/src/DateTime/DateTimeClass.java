package DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeClass {
	public static void main(String args[]) {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
		
		dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		String LST = dateFormat.format(date);
		System.out.println("London Timezone :   "+LST);
		
		dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
		String AST = dateFormat.format(date);
		System.out.println("\nSydney Timezone :   "+AST);
		
		dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		String PST = dateFormat.format(date);
		System.out.println("\nParis Timezone :   "+PST);
		
		dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		String IST = dateFormat.format(date);
		System.out.println("\nIndian Timezone :   "+IST);
		
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
		String MST = dateFormat.format(date);
		System.out.println("\nMexico Timezone :   "+MST);

	}

}
import java.util.*;
public class Calendars {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int month, year;
		System.out.println("Enter the Month:");
		month = sc.nextInt();
		System.out.println("Enter the Year:");
		year = sc.nextInt();
		sc.close();
		
		String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};						
		String dayName = "S  M  T  W  T  F  S";

		GregorianCalendar gc = new GregorianCalendar(year,month-1,1);
		int dayOfWeek = gc.get(Calendar.DAY_OF_WEEK);
		int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		String[] monthCal = new String[daysInMonth + dayOfWeek];
		
		for(int i = 0; i < dayOfWeek; i++){
			monthCal[i] = " ";
		}
		int cal = 1;
		for(int i = dayOfWeek - 1; i < daysInMonth + dayOfWeek; i++){			
			monthCal[i] = String.valueOf(cal);
			cal++;
		}
		System.out.println(monthName[month-1] + " " + year);	
		System.out.println(dayName);	
		String dateLine = "";
		dateLine = "";
		for(int i = 0; i < 7; i++){
			if(monthCal[i].length() == 1)
				dateLine += monthCal[i] + "  ";
			else
				dateLine += monthCal[i] + " ";
		}
		System.out.println(dateLine);
		dateLine = "";
		for(int i = 7; i < 14; i++){
			if(monthCal[i].length() == 1)
				dateLine += monthCal[i] + "  ";
			else
				dateLine += monthCal[i] + " ";	
		}
		System.out.println(dateLine);
		dateLine = "";
		for(int i = 14; i < 21; i++){
			if(monthCal[i].length() == 1)
				dateLine += monthCal[i] + "  ";
			else
				dateLine += monthCal[i] + " ";	
		}
		System.out.println(dateLine);
		dateLine = "";
		for(int i = 21; i < 28; i++){
			if(monthCal[i].length() == 1)
				dateLine += monthCal[i] + "  ";
			else
				dateLine += monthCal[i] + " ";	
		}
		System.out.println(dateLine);
		dateLine = "";
		for(int i = 28; i < 35; i++){
			if(monthCal[i].length() == 1)
				dateLine += monthCal[i] + "  ";
			else
				dateLine += monthCal[i] + " ";
		}
		System.out.println(dateLine);
		dateLine = "";
		for(int i = 35; i < daysInMonth + dayOfWeek - 1; i++){
			if(monthCal[i].length() == 1)
				dateLine += monthCal[i] + "  ";
			else
				dateLine += monthCal[i] + " ";
		}
		System.out.println(dateLine);

	}
}

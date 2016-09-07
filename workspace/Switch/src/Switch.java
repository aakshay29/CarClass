import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {

        int days;
        System.out.println("Enter number of days: ");
        Scanner sc = new Scanner(System.in);
		days = sc.nextInt();
        String monthName;
        switch (days) {
            case 30:  monthName = "September April June November";
                     break;
            case 31:  monthName = "January March May July August October December";
                     break;         
            case 26:  monthName = "February";
            		break;   
            default: monthName = "No months found";
                     break;
        }
        System.out.println(monthName);
        sc.close();

	}

}

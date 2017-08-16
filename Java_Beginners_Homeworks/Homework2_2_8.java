import java.util.Scanner;

public class Homework2_2_8 {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);	// Create new Scanner object

			// Prompt user enter the time
			System.out.print("Enter the time zone offset to GMT: ");
			int time_offset = input.nextInt();
			
			// Total milliseconds since midnight, Jan 1, 1970
			long total_Milliseconds = System.currentTimeMillis();

			// Total seconds since midnight, Jan 1, 1970
			long total_Seconds = total_Milliseconds / 1000;

			// Remainder in second
			long current_Second = total_Seconds % 60;

			// Total minutes
			long total_Minutes = total_Seconds / 60;

			// Remainder in minute
			long current_Minute = total_Minutes % 60;

			// Total hours
			long total_Hours = total_Minutes / 60;

			// Compute the current hour
			long current_Hour = total_Hours % 24;
			
			// Display results
			System.out.println("The Current Time is: " + current_Hour + ":"
				+ current_Minute + ":" + current_Second + " " + current_Hour + " hours " + current_Minute + " minutes " + current_Second + " seconds ");
		
			input.close(); //Closing input
	}
	}
			

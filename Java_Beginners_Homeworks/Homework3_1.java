import java.util.Scanner;

public class Homework3_1 {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a year, Example 1987 must be 4 digits: ");
		  int year = input.nextInt();
		 
		  System.out.print("Enter the first 3 letters of a month in capital letters:");
		  String month = input.next();
		  		 
		  int days = 0;
		 
		  switch (month) {
		  case "FEB":
		   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		    days = 29;
		    break;
		   }
		   days = 28;
		   break;
		 
		  case "APR":
		  case "JUN":
		  case "SEP":
		  case "NOV":
		   days = 30;
		   break;
		 
		  case "JAN":
		  case "MAR":
		  case "MAY":
		  case "JUL":
		  case "AUG":
		  case "OCT":
		  case "DEC":
		   days = 31;
		   break;
		 
		  default:
		   System.out.println("Invalid month, the letters must be Capital Letters");
		   System.exit(0);
		 
		  }
		 
		  System.out.println(month + " " + year + " has " + days + " days");
		

	}

}

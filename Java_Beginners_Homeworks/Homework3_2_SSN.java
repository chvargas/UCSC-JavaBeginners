import java.util.Scanner;

public class Homework3_2_SSN {

	public static void main(String[] args) {

		boolean valid = false;
		System.out.print("Enter SSN (example format 123-12-1234):");
	    Scanner inputUserSSN = new Scanner(System.in);
	    String ssnUser = inputUserSSN.next();
	    System.out.println("Input: " + ssnUser);
	    inputUserSSN.close();
	 
	    
	    if(ssnUser.length()==11) {
	       if( (ssnUser.charAt(3)=='-') & (ssnUser.charAt(6)=='-') ) {
	          String str = ssnUser.replaceAll("-", "");
	          if (str.matches("[0-9]+") & str.length()==9) {
	             System.out.println("The input was correct");;
	            }
	         }
	      }
	 
	      System.out.println("The input was incorrect, try again");

	}

}

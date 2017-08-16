import java.math.BigDecimal;

public class Hw_4 {

	public static void main(String[] args) {
	// variable names
		int seconds;
		int hours;
		int days;
		int years;
		int total_sec_x_year;
		int immigrant;
		int birth;
		int death;
		int population;
		
	// variable values
		seconds = 60;
		hours = 24; 
		days = 365;
		years = 5;
		total_sec_x_year = (seconds*60)*hours*days;
		immigrant = (int) (total_sec_x_year /45.0);
		birth = (int) (total_sec_x_year/7.0);
		death = (int) (total_sec_x_year/13.0);
		population = (int) 312032486.0;
		
			//1 immigrant every 45 sec
		System.out.println("total immingrants x year = " +immigrant);
						
	// 1 birth every 7 sec
		System.out.println("total new births x year = " + birth);
		
	//1 death every 7 sec
		System.out.println("total deaths x year = " + -death);
	
		System.out.println("initial population = " + population );
		System.out.println("Population 1st year ="+ ( population +  birth - death + immigrant));
		System.out.println("Population 2nd year ="+ ( population +  2* birth - 2* death + 2* immigrant));
		System.out.println("Population 3rd year ="+ ( population +  3* birth - 3* death + 3* immigrant));
		System.out.println("Population 4th year ="+ ( population +  4* birth - 4* death + 4* immigrant));
		System.out.println("Population 5th year ="+ ( population +  5* birth - 5* death + 5* immigrant));
	}

}

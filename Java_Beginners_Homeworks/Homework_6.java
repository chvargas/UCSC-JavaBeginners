import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Homework_6 {
    
	
    public void excercise9_2(){
    	Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(36.56);        
        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.println("Percent changed: " + stock1.getChangePercent());
       
       
    }
    
    
    public void excercise10_25(){
    
    		String s = "ab#cd#ef#gh";
    		String[] myArray = s.split("#");
    		System.out.println(Arrays.toString(myArray));
    		String[] myString;
	    
	
    }
 

	public static void main(String[] args) {
		
		Homework_6 homework6 = new Homework_6();
		homework6.excercise9_2();
		System.out.println("----------------------------------------------------");
		homework6.excercise10_25();
		
	}

}

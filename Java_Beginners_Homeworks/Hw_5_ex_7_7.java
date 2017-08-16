
public class Hw_5_ex_7_7 {
static final int SIZE = 100;
static final int RANGE = 10;
	
public static void main(String[] args) {


	        int[] randomNum = new int[SIZE];
	        int[] occurrence = new int[RANGE];
	        // we generate random numbers between a range of 0 to 9
	        for (int i = 0; i < randomNum.length; i++) {  //we create the loop for the random number
	            int num = (int)(Math.random() * RANGE);
	            randomNum[i] = num;
	            occurrence[num]++;
	        }

	        for (int i = 0; i < randomNum.length; i++) {

	            System.out.print(randomNum[i] + " ");
	            if ((i + 1) % 10 == 0) System.out.println("");
	        }

	        System.out.println();
	        for (int i = 0; i < occurrence.length; i++) {
	            System.out.println("The occurrence was repeated "+ i + " = " + occurrence[i] + " times") ;


	        }




	    }

	    public static void printArray(int[] array, int numberPerLine) {

	        for (int i = 0; i < array.length; i++) {

	            System.out.printf("%4d", array[i]);
	            if ((i + 1) % numberPerLine == 0) System.out.println("");
	        }

	}

}

import java.util.Scanner;

public class Hw_5_ex_7_10 {

	static final int SIZE = 10;

	public static void main(String[] args) {

        double[] numbers = new double[SIZE];
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter " + SIZE + " numbers (must be integers): ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = sc.nextDouble();

        System.out.println("The index of the smallest number is: " + indexOfSmallestElement(numbers));

    }

    public static int indexOfSmallestElement(double[] array) {

        int index = 0;
        double low = array[index];
        for (int i = 0; i < array.length; i++) {

            if (low > array[i]) {
                low = array[i];
                index = i;
            }
        }
        return index;
	}

}

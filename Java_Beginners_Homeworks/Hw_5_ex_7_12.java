import java.util.Scanner;

public class Hw_5_ex_7_12 {
	
	static final int SIZE = 10;

    public static void main(String[] args) {

        double[] array = new double[SIZE];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " numbers (must be integers) : ");
        for (int i = 0; i < array.length; i++) array[i] = sc.nextDouble();

        double[] reverse = reverse(array);

        System.out.println("The array in reverse was: ");
        printArray(reverse, 10);
    }

    public static double[] reverse(double[] original) {

        double[] reverse = new double[original.length];

        int endIndex = original.length - 1;

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = original[endIndex--];
        }

        return reverse;
    }

    public static void printArray(double[] array, int numberPerLine) {

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%4.2f ", array[i]);
            if ((i + 1) % numberPerLine == 0) System.out.println("");
        }

	}

}

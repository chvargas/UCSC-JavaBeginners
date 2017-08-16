import java.util.Scanner;

public class Homework2_3_33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double weight_package_1;
		double price_package_1;
		double weight_package_2;
		double price_package_2;
	
		System.out.print("Enter weight for package #1: ");
		weight_package_1 = input.nextDouble();
		System.out.print("Enter price for package #1: ");
		price_package_1 = input.nextDouble();
		double ratio_package1 = weight_package_1 / price_package_1 ;
		System.out.println(ratio_package1);
		
		System.out.print("Enter weight for package #2: ");
		weight_package_2 = input.nextDouble();
		System.out.print("Enter price for package #2: ");
		price_package_2 = input.nextDouble();
		double ratio_package2 = weight_package_2 / price_package_2 ;
		System.out.println(ratio_package2);
		
		if (price_package_1 > price_package_2){
			System.out.println("Package 2 has better price " + price_package_2);
			
		if (price_package_2 > price_package_1) {
			System.out.println("Package 1 has better price " + price_package_1);		
			}
		}
		else if (price_package_2 > price_package_1){
				System.out.println("Package 1 has better price " + price_package_1);
			}
		}
	}



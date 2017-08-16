import java.util.Scanner;

public class Homework3_3_Cities {

	public static void main(String[] args) {
						    
		do 
		{
			Scanner input = new Scanner(System.in);
			System.out.print(" Enter First Name : ");
		    String name1 = input.nextLine();
		    System.out.print(" Enter Second Name : ");
		    String name2 = input.nextLine();
		    System.out.print(" Enter Third Name : ");
		    String name3 = input.nextLine();
		    
			char characterName1 = name1.charAt(0);
			char characterName2 = name2.charAt(0);
			char characterName3 = name3.charAt(0);
			
		    characterName1 = Character.toUpperCase(characterName1);
		    characterName2 = Character.toUpperCase(characterName2);
		    characterName2 = Character.toUpperCase(characterName2);
		    	   		    
		    
		    if ((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0))
				{
					System.out.println(name1);
					if (name2.compareTo(name3) < 0) 
					{
						System.out.println(name2);
		                System.out.println(name3);
					}
				else
					{
						System.out.println(name3);
						System.out.println(name2);
					}
				}
			else if ((name1.compareTo(name2) > 0) &&  (name2.compareTo(name3) < 0))
				{
					System.out.println(name2);
					if (name1.compareTo(name3) < 0)
					{
					System.out.println(name1);
					System.out.println(name3);
					}
					else
					{
					System.out.println(name3);
					System.out.println(name1);
					}
				} 	
			else
				{
				System.out.println(name3);
					if (name1.compareTo(name2) < 0) 
					{
						System.out.println(name1);
						System.out.println(name2);
					}
					else
					{
						System.out.println(name2);
						System.out.println(name1);
					}
				}
		
		} while (false);
	
	}
}

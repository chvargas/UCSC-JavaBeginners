

public class Homework_3_4 
{
	public static void main(String[] args) 
	
	{
		int randonNumber;
		String randomA_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String plate = "";
        
        for (int n = 1; n <= 3; n++) 
        {
            randonNumber = (int) (Math.random() * 26);
            plate += randomA_Z.substring(randonNumber,randonNumber+1);
        }

        for (int n = 1; n <= 4; n++) 
        {
            randonNumber = (int) (Math.random() * 9 +1);
            plate += randonNumber;
        }
        System.out.println("Plate: " + plate);
	}
}

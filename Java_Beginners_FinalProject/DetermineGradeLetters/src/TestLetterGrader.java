import java.io.* ;

public class TestLetterGrader {
	
	public static void main(String[] args) throws IOException {
		
		//Parsing command line arguments and checking
		
		if (args.length != 2){
			//If user fails to input correct # of args, user will know what input files need
			System.out.println("You need two command line arguments to run this program.");
			System.out.println("Usage:\njava TestLetterGrader inputfile outputfile ");
			return;
		}
	
		//Create new letterGrader
		LetterGrader letterGrader = new LetterGrader(args[0], args[1]);
		
		//Reads input file and creates students 
		letterGrader.ReadandCreateStudents();
		
		//Calculates students final grade  
		letterGrader.calcGrades();
		
		//Prints grades to output file
		letterGrader.printGrades();
		
		//Displays average assignment score 
		letterGrader.displayAvg();
		
		//Displays min assignment score 
		letterGrader.displayMin(); 
		
		//Displays max assignment score 
		letterGrader.displayMax(); 
		
		//Closes program
		letterGrader.cleanup();

	}

}



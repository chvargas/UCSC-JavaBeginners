
public class TestLetterGrader {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("USAGE: java TestLetterGrader <input_file_name> <output_file_name>");
			System.exit(1);
		}
		
		LetterGrader letterGrader =	new	LetterGrader(args[0],	args[1]);
		
		letterGrader.readScore();		//reads	score and save the data in variables
		letterGrader.calcLetterGrade(); //determines letter grade and save data
		letterGrader.printGrade();	    //writes grade in output file
		letterGrader.displayAverages(); //displays avg in console
		letterGrader.doCleanup();		//close files and other resources 
	}

}

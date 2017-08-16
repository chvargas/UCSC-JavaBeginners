import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LetterGrader {
	
	//Input and output files
	private String inputFile; 
	private String outputFile;
	
	//Weights of each grade //static because they won't change
	final static double quizW = 0.1;
	final static double midiW = 0.2;
	final static double midiiW = 0.15;
	final static double finalTestW = 0.25;
	
	//Number of assignments. 
	private int numberOfAssignments = 7; 
	
	//Creating students arraylist 
	private static ArrayList<Students> studentList = new ArrayList<Students>();
	
	//creating and Initializing Avg, Min, and Max variables for each assignment  
	private double quiz1Avg = 0; 
	private int quiz1Min = 999;
	private int quiz1Max = -999;
	private double quiz2Avg = 0;
	private int quiz2Min = 999;
	private int quiz2Max = -999;
	private double quiz3Avg = 0;
	private int quiz3Min = 999;
	private int quiz3Max = -999;
	private double quiz4Avg = 0;
	private int quiz4Min = 999;
	private int quiz4Max = -999;
	private int midiMin = 999;
	private int midiMax = -999;
	private double midiAvg = 0;
	private double midiiAvg = 0;
	private int midiiMin = 999;
	private int midiiMax = -999;
	private double finalTestAvg = 0;
	private int finalTestMin = 999;
	private int finalTestMax = -999;
	
	//Create LetterGrader method
	public LetterGrader(String arg1, String arg2) {
		this.inputFile = arg1;
		this.outputFile = arg2; 	
	}
	
	//Method that will read and create Students
	public void ReadandCreateStudents(){
		BufferedReader reader = null;
		String line = "";
		
		//Text and Values are separated by ", " 
		String splitBy = ", ";
		
		try {
			//New reader based on the input file 
			reader = new BufferedReader(new FileReader(inputFile));
			
			//While the next line is not null read the next line. All students in the file will be read.
			while ((line = reader.readLine()) != null) {
				
				//Create string array of Students based on ',' split value  
				String[] Students = line.split(splitBy); 
				
				//Add the student info to the array
				Students studentsInfo = new Students(); 
				
				studentsInfo.setName(Students[0]);
				studentsInfo.setQuiz1(Students[1]);
				studentsInfo.setQuiz2(Students[2]);
				studentsInfo.setQuiz3(Students[3]);
				studentsInfo.setQuiz4(Students[4]);
				studentsInfo.setMidi(Students[5]);
				studentsInfo.setMidii(Students[6]);
				studentsInfo.setFinalTest(Students[7]);
				
				//Add student to student ArrayList 
				studentList.add(studentsInfo);	
			}
			//reader is done so close. 
			reader.close();
			
		} catch (IOException e) {
			//If there is an error with the input file print error message and close program. 
			out.println("There is an error with your input file. /nPlease make sure it is in the correct directory.");
			System.exit(1);
		} finally {
			try {
				//Close reader 
				if (reader != null){
					reader.close();
				}
			} catch (IOException ex) {
				out.println("There is an issue with your input file.");
				System.exit(1);
			}
		}
		
	//Sorting student's name after they all already are in the arrayList
		
	Collections.sort(studentList, Students.studentNameComparator);
	}
	
	public void calcGrades(){
		for(int i = 0; i < studentList.size(); i++){
		
			//Set quiz value 
			double quiz1 =  Double.parseDouble(studentList.get(i).getQuiz1());
			double quiz2 = Double.parseDouble(studentList.get(i).getQuiz2());
			double quiz3 = Double.parseDouble(studentList.get(i).getQuiz3());
			double quiz4 = Double.parseDouble(studentList.get(i).getQuiz4());
			double midi = Double.parseDouble(studentList.get(i).getMidi());
			double midii = Double.parseDouble(studentList.get(i).getMidii());
			double finalTest = Double.parseDouble(studentList.get(i).getFinalTest());
			
			//Calculate students % grade with weight
			double percent = (quiz1 * quizW) + (quiz2 * quizW) + (quiz3 * quizW) + (quiz4 * quizW) + (midi * midiW) + (midii * midiiW) + (finalTest * finalTestW);
			
			//Convert to integer 
			int intPercent = (int)percent; 
			
			//Set % for student 
			studentList.get(i).setPercentGrade(intPercent);
			
			//If else checking student letter grade based on percent value 
			if(intPercent >= 90){
				studentList.get(i).setFinalGrade(" A ");
			}
			else if(intPercent >= 80){
				studentList.get(i).setFinalGrade(" B ");
			}
			else if(intPercent >= 70){
				studentList.get(i).setFinalGrade(" C ");
			}
			else if(intPercent >= 60){
				studentList.get(i).setFinalGrade(" D ");
			}
			else{
				studentList.get(i).setFinalGrade(" F ");
			}
		}
	}
	
	public void displayAvg(){
		
		//Print to the console. 
		out.printf("The letter grade has been calculated for students listed \nin the input file %s and outputted in the output file %s.\n\n", inputFile, outputFile);
		out.print("The class averages are:\n\n");
		
		//Printing and tabulating headers for the data 
		out.printf("\t\tQ1\tQ2\tQ3\tQ4\tMid1\tMid2\tFinal\n");

		//Creating and initializing variables
		double quizAvgTotal = 0;
		double quizAvgCalc;
		
		//PrintingAverage for all students
		System.out.print("Average: ");
		
		try{	
		//Loop through assignments 
		for(int i = 0; i < numberOfAssignments; i++ ){
			
			//Loop through students 
			for(int s = 0; s < studentList.size(); s++){
				quizAvgTotal += Integer.parseInt(studentList.get(s).getQuiz(i));
				
				//calculating assignment averages
					if(s == numberOfAssignments){
						quizAvgCalc = (quizAvgTotal/studentList.size());
						this.setQuizAvg (i, quizAvgCalc);
						
						//reset quizAvgCalc and quizAvgTotal 
						quizAvgCalc = 0;
						quizAvgTotal = 0; 
					}
			}
			//print assignment average value
			out.printf("\t%.2f", this.getQuizAvg(i));
		}	
		}
		//Catch exception 
		catch (Exception e){
			out.print("Exception while calculating average");
			System.exit(1);
		}
	}
	
	//Method for displaying Mid 
	public void displayMin(){
		int quizMinCheck;
		//Print row name
		out.print("\nMinimum: ");
		//Iterate through the assignments 
		for(int i = 0; i < numberOfAssignments; i++ ){
			//Iterate through the students assignment score 
			for(int s = 0; s < studentList.size(); s++){
				 quizMinCheck = Integer.parseInt(studentList.get(s).getQuiz(i));
				//If quizMinCheck is less than the current min then set score to quizMinCheck
					if(quizMinCheck < this.getQuizMin(i)){
						this.setQuizMin(i, quizMinCheck);	
					}			
				}
			//Print assignment min value
			out.print("\t" + this.getQuizMin(i));
		}	
	 }
	
	//Display max
	public void displayMax(){
		//Print row header
	    out.print("\nMaximum: ");
		int quizMaxCheck;
		//iterate through the assignments 
		for(int i = 0; i < numberOfAssignments; i++ ){
			//iterate through the students scores 
			for(int s = 0; s < studentList.size(); s++){		
				quizMaxCheck = Integer.parseInt(studentList.get(s).getQuiz(i));
				//If quizMaxCheck is greater than the current max then set score to quizMaxCheck
					if(quizMaxCheck > this.getQuizMax(i)){
						this.setQuizMax(i,quizMaxCheck);
					}	
				}
			//print assignment maxx value 
			out.print("\t"+ this.getQuizMax(i));
					}
				}
	
	//Prints grades 
	public void printGrades(){
		try {
			//Sets output file 
			PrintWriter outputStream = new PrintWriter(outputFile);
			
			//Prints info string 
			outputStream.printf("Letter grade for %d students given in %s file is:\n", studentList.size(), inputFile);
			
			//Iterates through studentList and prints name and final grade 
			for(int i = 0; i < studentList.size(); i ++){
			outputStream.printf("%s:\t\t%s\n", studentList.get(i).getName(i),studentList.get(i).getFinalGrade());
			}
			outputStream.close();
		} catch(IOException ex) {
		    out.print("There is an error with your output file.");    
		}
	}
	
	//Method to close the program 
	public void cleanup() {
		Scanner input = new Scanner(System.in);
		out.println("\n\nPress ENTER to continue...");
		input.nextLine();
		input.close();
		// Pause until user presses enter  
		//Exit the program
		System.exit(1);
	}
	

//Getters and setters
	//get assignment value 
	public int getQuizMin(int i) {
		switch(i){
		case 0: return quiz1Min;
		case 1: return quiz2Min;
		case 2: return quiz3Min;
		case 3: return quiz4Min;
		case 4: return midiMin;
		case 5: return midiiMin; 
		case 6: return finalTestMin; 
		//Default would return in an error case
		default:return 404;
		}
	}
	
	//get assignment max value 
	public int getQuizMax(int i) {
		switch(i){
		case 0: return quiz1Max;
		case 1: return quiz2Max;
		case 2: return quiz3Max;
		case 3: return quiz4Max;
		case 4: return midiMax;
		case 5: return midiiMax; 
		case 6: return finalTestMax; 
		//Default would return in an error case
		default:return 404;
		}
	}
	
	//get assignment avg value 
	public double getQuizAvg(int i) {
		switch(i){
		case 0: return quiz1Avg;
		case 1: return quiz2Avg;
		case 2: return quiz3Avg;
		case 3: return quiz4Avg;
		case 4: return midiAvg;
		case 5: return midiiAvg; 
		case 6: return finalTestAvg; 
		//Default would return in an error case 
		default:return 404;
		}
	}
	
	//set assignment min value 
	public void setQuizMin(int i, int min) {
		switch(i){
		case 0: this.quiz1Min = min;break; 
		case 1: this.quiz2Min = min;break; 
		case 2: this.quiz3Min = min;break; 
		case 3: this.quiz4Min = min;break; 
		case 4: this.midiMin = min;break; 
		case 5: this.midiiMin = min;break; 
		case 6: this.finalTestMin = min;break; 
		}
	}
	
	//set assignment max value 
	public void setQuizMax(int i, int max) {
		switch(i){
		case 0: quiz1Max = max;break; 
		case 1: this.quiz2Max = max;break; 
		case 2: this.quiz3Max = max;break; 
		case 3: this.quiz4Max = max;break; 
		case 4: this.midiMax = max;break; 
		case 5: this.midiiMax = max;break; 
		case 6: this.finalTestMax = max;break; 
		}
	}
	
	//set assignment avg value 
	public void setQuizAvg(int i, double avg) {
		switch(i){
		case 0: this.quiz1Avg = avg;break; 
		case 1: this.quiz2Avg = avg;break; 
		case 2: this.quiz3Avg = avg;break; 
		case 3: this.quiz4Avg = avg;break; 
		case 4: this.midiAvg= avg;break; 
		case 5: this.midiiAvg = avg;break; 
		case 6: this.finalTestAvg = avg;break; 
		}
	}
	
}
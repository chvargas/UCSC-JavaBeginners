import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LetterGrader {
	
	//Declaring lists and variables
	
	private String inputFileName;
	private String outputFileName;
	private ArrayList <String> studentName;
	private ArrayList <Double> quiz1;
	private ArrayList <Double> quiz2;
	private ArrayList <Double> quiz3;
	private ArrayList <Double> quiz4;
	private ArrayList <Double> midTerm_i;
	private ArrayList <Double> midTerm_ii;
	private ArrayList <Double> finalExam;
	private ArrayList <String> grade;
	
	final static double quizW = 0.1;
	final static double midiW = 0.2;
	final static double midiiW = 0.15;
	final static double finalTestW = 0.25;
	
	LetterGrader(String inputFileName, String outputFileName) {
	
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
		studentName = new ArrayList<String>();
		quiz1 = new ArrayList<Double>();
		quiz2 = new ArrayList<Double>();
		quiz3 = new ArrayList<Double>();
		quiz4 = new ArrayList<Double>();
		midTerm_i = new ArrayList<Double>();
		midTerm_ii = new ArrayList<Double>();
		finalExam = new ArrayList<Double>();
		grade = new ArrayList<String>();
	}
	
	//Reading file
	
	public void readScore() {
	
		File inputFile = new File(inputFileName);
	
		if (!inputFile.exists()) {
			System.out.println("Input file " + inputFileName + " doesn't exist");
			System.exit(2);
		}
		
		try {
			Scanner input = new Scanner(inputFile);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				// reading info from input file

				// Splitting students data
				String[] studentInfo = line.split(",");
	
				studentName.add(studentInfo[0]);
				quiz1.add(Double.parseDouble(studentInfo[1]));
				quiz2.add(Double.parseDouble(studentInfo[2]));
				quiz3.add(Double.parseDouble(studentInfo[3]));
				quiz4.add(Double.parseDouble(studentInfo[4]));
				midTerm_i.add(Double.parseDouble(studentInfo[5]));
				midTerm_ii.add(Double.parseDouble(studentInfo[6]));
				finalExam.add(Double.parseDouble(studentInfo[7]));
			}
			input.close();
		} catch (IOException e) {
			System.out.println("Error reading from input file: " + e);
		}
	}

	//calculating grades based in weight percentages
	public void calcLetterGrade() {
		for (int i = 0; i < studentName.size(); i++) {
			double totalScore = quiz1.get(i) * quizW + quiz2.get(i) * quizW +
								quiz3.get(i) * quizW + quiz4.get(i) * quizW +
								midTerm_i.get(i) * midiW + midTerm_ii.get(i) * midiiW +
								finalExam.get(i) * finalTestW ;
			
			//adding letter grades to students based in calculation
			
			if (totalScore >= 90) {
				grade.add("A");
			} else if (totalScore >= 80) {
				grade.add("B");
			} else if (totalScore >= 70) {
				grade.add("C");
			} else if (totalScore >= 60) {
				grade.add("D");
			} else {
				grade.add("F");
			}
		}		
	}

	//sorting student's names
	private  void sortByNames(){
		  
	       for (int i = 0; i < studentName.size(); i++) 
	       {
	           for (int j = i + 1; j < studentName.size(); j++) 
	           {
	               if (studentName.get(i).compareTo(studentName.get(j))>0) 
	               {
	            	   String temp = studentName.get(i);
	            	   studentName.set(i,studentName.get(j));
	            	   studentName.set(j,temp);
	                   
	                 //Swapping scores
	                   temp = grade.get(i);
	                   grade.set(i,grade.get(j));
	                   grade.set(j,temp);
	               }
	           }
	       }
	}
	
	//The output file will have grade information of all students that was read from	
	//input	file, in a sorted order
	
	public void printGrade() {
		sortByNames();
		File outputFile = new File(outputFileName);
		try {
			// output file is created and data is written on it 
			PrintWriter output = new PrintWriter(outputFile);
			output.printf("Letter grade for %d students given in '%s' file is:\n",
							  studentName.size(), inputFileName);
			output.println("");
			for (int i = 0; i < studentName.size(); i++) {
				output.println(studentName.get(i) + ":\t"+ grade.get(i));
			}
			output.close(); // close o/p file
		}catch (IOException e) {
			 System.out.println("Error writing on outputfile"+ e);
		}
	}
	
	//Calculating avg, min and max values
	
	private double[] calculateStatistics(ArrayList<Double> list) {
		double sum = 0;
		double minimum = list.get(0);
		double maximum = list.get(0);
		double[] ret = new double[3];
		
		for (int i = 0; i < list.size(); i++) {
			//Average
			sum += list.get(i);
			
			//Minimun
			if(list.get(i)< minimum){ 
		         minimum = list.get(i); 
		      } 
			
			//Maximun
			if(list.get(0) > maximum){ 
		         maximum = list.get(i); 
		      } 
		}
		double average = sum/list.size();
		
		//return average, minimum, maximum 
		ret[0] = average;
		ret[1] = minimum;
		ret[2] = maximum;
		
		return ret;
	}

	//display average minimum and maximum
	public void displayAverages() {
		
		double[] quiz1Stats = calculateStatistics(quiz1);
		double[] quiz2Stats = calculateStatistics(quiz2);
		double[] quiz3Stats = calculateStatistics(quiz3);
		double[] quiz4Stats = calculateStatistics(quiz4);
		double[] midterm1Stats = calculateStatistics(midTerm_i);
		double[] midterm2Stats = calculateStatistics(midTerm_ii);
		double[] finalExamStats = calculateStatistics(finalExam);

		System.out.println("\nLetter grade has been calculated for students listed in"
				+ " input file " + inputFileName + " and written to output file " + outputFileName );
		
		System.out.println("\nHere is the class averages:");
		
		System.out.println("\n\tQuiz1 \tQuiz2 \tQuiz3 \tQuiz4 \tMidt1 \tMidt2 \tfinal \n");
		
		System.out.println("Average: " +quiz1Stats[0]+"\t"+quiz2Stats[0]+"\t"+quiz3Stats[0]+"\t"+quiz4Stats[0]+
				"\t"+midterm1Stats[0]+"\t"+midterm2Stats[0]+"\t"+finalExamStats[0]);
		
		System.out.println("Minimum: "+quiz1Stats[1]+"\t"+quiz2Stats[1]+"\t"+quiz3Stats[1]+"\t"+quiz4Stats[1]+
				"\t"+midterm1Stats[1]+"\t"+midterm2Stats[1]+"\t"+finalExamStats[1]);
		
		System.out.println("Maximum: "+quiz1Stats[2]+"\t"+quiz2Stats[2]+"\t"+quiz3Stats[2]+"\t"+quiz4Stats[2]+
				"\t"+midterm1Stats[2]+"\t"+midterm2Stats[2]+"\t"+finalExamStats[2]);
		}
	
	public void doCleanup() {

		//for exiting after enter key is pressed
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n Press ENTER key to continue...");
		input.nextLine();
		input.close();
	}


}

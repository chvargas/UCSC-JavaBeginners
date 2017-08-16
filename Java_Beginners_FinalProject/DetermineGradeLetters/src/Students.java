//Import for sorting students 
import java.util.Comparator;

public class Students implements Comparable <Students>{
	
		//Create student variables, 
		// name, quizes, midterms, finalTest, percentageGrade, and Final grade 
		 private String name; 
		 private String quiz1;
		 private String quiz2;  
		 private String quiz3;  
		 private String quiz4;
		 private String midi;  
		 private String midii;  
		 private String finalTest;
		 private double percentGrade; 
		 private String finalGrade; 
		 
		 //getName 
		 public String getName(int i) {  
			 return name;  
		 }  
		
		 public String getName() {  
			 return name;  
		 }  
		  
		 public void setName(String name) {  
			 this.name = name;  
		 }  
		 
		//Getting all the scores for all the students assignments, with a switch
		 public String getQuiz(int i) {  
			 switch(i){
			 case 0: 
				 return quiz1;
			 case 1: 
				 return quiz2;
			 case 2: 
				 return quiz3; 
			 case 3: 
				 return quiz4;
			 case 4: 
				 return midi; 
			 case 5: 
				 return midii; 
			 case 6: 
				 return finalTest;
			 default:return "Format error";
			 }
		 }  
		  
		 //Get and set for assignments 
		 public String getQuiz1() {  
				 return quiz1;
		 }  
		  
		 public void setQuiz1(String quiz1) {  
			 this.quiz1 = quiz1;  
		 }
		 
		 public String getQuiz2() {  
			 return quiz2;  
		 }  
		  
		 public void setQuiz2(String quiz2) {  
			 this.quiz2 = quiz2;  
		 }
		 
		 public String getQuiz3() {  
			 return quiz3;  
		 }  
		  
		 public void setQuiz3(String quiz3) {  
			 this.quiz3 = quiz3;  
		 }  
		 
		 public String getQuiz4() {  
			 return quiz4;  
		 }  
		  
		 public void setQuiz4(String quiz4) {  
			 this.quiz4 = quiz4;  
		 } 
		 
		 public String getMidi() {  
			 return midi;  
		 }  
		  
		 public void setMidi(String midi) {  
			 this.midi = midi;  
		 }
		 
		 public String getMidii() {  
			 return midii;  
		 }  
		  
		 public void setMidii(String midii) {  
			 this.midii = midii;  
		 }
		 
		 public String getFinalTest() {  
			 return finalTest;  
		 }  
		  
		 public void setFinalTest(String finalTest) {  
			 this.finalTest = finalTest;  
		 }  
		 
		 public String getFinalGrade() {  
			 return finalGrade;  
		 }  
		  
		 public void setFinalGrade(String finalGrade) {  
			 this.finalGrade = finalGrade;  
		 }  
		 
		 public double getPercentGrade() {  
			 return percentGrade;  
		 }  
		  
		 public void setPercentGrade(double percentGrade) {  
			 this.percentGrade = percentGrade;  
		 }

		//OverrideClass to run 
		public int compareTo(Students compareStudents) {
			return 0;
		}
		
		//Compare and sort Students
		public static Comparator<Students> studentNameComparator = new Comparator<Students>(){
			public int compare(Students student1, Students student2){
				String studentName1 = student1.getName().toUpperCase();
				String studentName2 = student2.getName().toUpperCase();
				return studentName1.compareTo(studentName2);	
			}
		};
}

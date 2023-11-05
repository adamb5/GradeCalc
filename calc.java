//Created by Adam Brook 9/9/2023

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
	    
		double aWeight = 0.36;
		double sWeight = 0.10;
		double qWeight = 0.02;
		double eWeight = 0.54;

		
	    Scanner in = new Scanner(System.in);
		System.out.println("Here is the CSE Grade for: ");
		
		String name = in.next();  
	    System.out.println();
	    
	    Scanner in2 = new Scanner(System.in);
		System.out.println("Average assignment grade: " );
	


		double averageAssignmentGrade = in.nextDouble();  
	    double weightedAssignment = aWeight * averageAssignmentGrade;
	    double result = Math.round(weightedAssignment*100.00)/100.00;
	    System.out.println("Weighted assignment grade (out of 36):" + result + "%");
	    	    	    
	    Scanner in4 = new Scanner(System.in);
		System.out.println("Number of studios attended: " );
		
	  
		double studiosAttended = in.nextInt();  
		double weightedStudio = 10 *(studiosAttended)/8;
	    System.out.println("Weighted studio grade (out of 10):" + weightedStudio + "%");

	    
	    Scanner in6 = new Scanner(System.in);
		System.out.println("Average quiz grade: ");
	

		double averageQuizGrade = in.nextDouble();  
		double weightedQuiz = averageQuizGrade * qWeight;
	    double result2 = Math.round(weightedQuiz*100.00)/100.00;
	    System.out.println("Weighted quiz grade (out of 2):" + result2 + "%");
	    
		
	    Scanner in8 = new Scanner(System.in);
		System.out.println("Average exam grade: ");
	

		double averageExamGrade = in.nextDouble();  
		double weightedExam = averageExamGrade * eWeight;
	    System.out.println("Weighted exam grade (out of 54):" + weightedExam + "%");
	    
	    //Weighted all and total grade needs rounding
	    
	    double finalG = weightedAssignment + weightedStudio + weightedQuiz + weightedExam;
	    Scanner in10 = new Scanner(System.in);
		System.out.println("Total Grade: " + finalG + "%"); 
		
		
	}
}

	

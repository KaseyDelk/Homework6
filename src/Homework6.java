import java.util.Scanner;
public class Homework6 {
	public static void main(String[] args) {

				System.out.println("Hello Class!");
				// This is my branch I use for classwork
		
				int score = 0;
				int hardnessOfQuestion = 10;
				
				//Round 1
				//Generate 2 random numbers
				int number1 = (int)(Math.random() * hardnessOfQuestion);	
				int number2 = (int)(Math.random() * hardnessOfQuestion);
				
				//Note the correct answer.
				int correctAnswer = number1 + number2;
				
				//Ask the user to add these two numbers together
				System.out.println
				("What is " + number1 + " + " + number2 + "?");
				
				//Read their response
				Scanner input = new Scanner(System.in);
				int studentAnswer = input.nextInt();
				
				//Check if the answer was correct
				//IF correct
				if (studentAnswer == correctAnswer){
				//Tell them it was correct
				System.out.println("Answer was correct");
				//Give them points
				score += hardnessOfQuestion;
				System.out.println("Score is: " + score);
				//Make the next question harder
				hardnessOfQuestion *= 10;	
				System.out.println("hardness is: " + hardnessOfQuestion);
				}
				//IF not correct
				else{
				//Tell them it was wrong
				System.out.println("Answer was not correct");
				//Tell them the correct answer
				System.out.println("The correct answer was: " + correctAnswer);
				//Do not give them points
				//Make the next question easier
		}
	}
}
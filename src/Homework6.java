import java.util.Scanner;
public class Homework6 {
	public static void main(String[] args) {

		   	//This is the development branch
			
			int score = 0;
			int hardnessofquestion = 10;
			//Round 1
		
			//Generate 2 random numbers
			int number1round1 = (int) (Math.random () * hardnessofquestion);
			System.out.println("Number is " + number1round1);
			
			int number2round1 = (int) (Math.random () * hardnessofquestion);
			System.out.println("Number is " + number2round1);
			int correctAnswer = number1round1 + number2round1;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round1 + " + " + number2round1 + "?");
			 
			//Read their response 
			Scanner input = new Scanner(System.in);
			int userAnswer = input.nextInt();

		    //Check if the answer was correct
			//give them points if correct
			if (userAnswer == correctAnswer){
				System.out.println("Answer was correct.");
				hardnessofquestion *= 10;
				System.out.println("Score is: " + hardnessofquestion);
			}else{
				System.out.println("Answer is incorrect.");
				System.out.println("You recieved no points.");
				System.out.println("Answer was " + correctAnswer);
			}
			//Make the next question harder
		 	
			/* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier
			*/
			
			//Round 2
			//Round 3
			//Round 4
	}
}
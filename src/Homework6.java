import java.util.Scanner;
public class Homework6 {
	public static void main(String[] args) {

		   	//This is my development branch
			//Round 1
		
			//Generate 2 random numbers
			int number1 = (int) (Math.random () * 10);
			System.out.println("Number is " + number1);
			
			int number2 = (int) (Math.random () * 10);
			System.out.println("Number is " + number2);
			int correctAnswer = number1 + number2;
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1 + " + " + number2 + "?");
			 
			//Read their response 
			Scanner input = new Scanner(System.in);
			int userAnswer = input.nextInt();
			
		 
		    //Check if the answer was correct
			//If correct
			if (userAnswer == correctAnswer){
				System.out.println("Answer was correct.");
			}else{
				System.out.println("Answer is incorrect.");
			}
		
			/* 
			* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier
			* 
			* Round 2
			* Generate 2 random numbers
			* Ask the user to add these two numbers together
			* Read their response 
			* Check if the answer was correct
			* 	If correct
			* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier
			*  
			* Round 3
			* Generate 2 random numbers
			* Ask the user to add these two numbers together
			* Read their response 
			* Check if the answer was correct
			* 	If correct
			* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier
			* 
			* Round 4	
			*  Generate 2 random numbers
			* Ask the user to add these two numbers together
			* Read their response 
			* Check if the answer was correct
			* 	If correct
			* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier	
			*/

	}
}

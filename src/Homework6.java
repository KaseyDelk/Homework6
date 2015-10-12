import java.util.Scanner;
public class Homework6 {
	public static void main(String[] args) {

		   	//This is the development branch
			//Round 1
		
			//Generate 2 random numbers
			int number1round1 = (int) (Math.random () * 10);
			System.out.println("Number is " + number1round1);
			
			int number2round1 = (int) (Math.random () * 10);
			System.out.println("Number is " + number2round1);
			int correctAnswer = number1round1 + number2round1;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round1 + " + " + number2round1 + "?");
			 
			//Read their response 
			Scanner input = new Scanner(System.in);
			int userAnswer = input.nextInt();

		    //Check if the answer was correct
			//give them points
			if (userAnswer == correctAnswer){
				System.out.println("Answer was correct. You received 10 points.");
			}else{
				System.out.println("Answer is incorrect. You received 0 points. ");
			}
			 
			/* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier
			*/
			
			// Round 2
			//Generate 2 random numbers
			int number1round2 = (int) (Math.random () * 10);
			System.out.println("Number is " + number1round2);
			
			int number2round2 = (int) (Math.random () * 10);
			System.out.println("Number is " + number2round2);
			int correctAnswer2 = number1round2 + number2round2;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round2 + " + " + number2round2 + "?");
			 
			//Read their response 
			int userAnswer2 = input.nextInt();

		    //Check if the answer was correct
			//give them points
			if (userAnswer2 == correctAnswer){
				System.out.println("Answer was correct. You received 10 points.");
			}else{
				System.out.println("Answer is incorrect. You received 0 points. ");
			}
			
			/* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier
			*/ 
			
			//Round 3
			//Generate 2 random numbers
			int number1round3 = (int) (Math.random () * 10);
			System.out.println("Number is " + number1round3);
			
			int number2round3 = (int) (Math.random () * 10);
			System.out.println("Number is " + number2round3);
			int correctAnswer3 = number1round3 + number2round3;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round3 + " + " + number2round3 + "?");
			 
			//Read their response 
			int userAnswer3 = input.nextInt();

		    //Check if the answer was correct
			//give them points
			if (userAnswer3 == correctAnswer){
				System.out.println("Answer was correct. You received 10 points.");
			}else{
				System.out.println("Answer is incorrect. You received 0 points. ");
			}
			
			/* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier
			*/
			
			// Round 4	
			//Generate 2 random numbers
			int number1round4 = (int) (Math.random () * 10);
			System.out.println("Number is " + number1round4);
			
			int number2round4 = (int) (Math.random () * 10);
			System.out.println("Number is " + number2round4);
			int correctAnswer4 = number1round4 + number2round4;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round4 + " + " + number2round4 + "?");
			 
			//Read their response 
			int userAnswer4 = input.nextInt();

		    //Check if the answer was correct
			//give them points
			if (userAnswer4 == correctAnswer){
				System.out.println("Answer was correct. You received 10 points.");
			}else{
				System.out.println("Answer is incorrect. You received 0 points. ");
			}
			
			/* 	Tell them it was correct
		 	* 	& give them points
			* Make the next question harder
			* 	If not correct
			* 	Tell them the correct answer
			* 	& do not give them points
			* 	Make next question easier	
			*/

	}
}

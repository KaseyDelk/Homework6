import java.util.Scanner;
public class Homework6 {
	public static void main(String[] args) {

		   	//This is the development branch
			
			int score = 0;
			int hardnessofquestion = 10;
			
			//Round 1
			//Generate 2 random numbers
			int number1round1 = (int) (Math.random () * hardnessofquestion);
			int number2round1 = (int) (Math.random () * hardnessofquestion);
			int correctAnswer1 = number1round1 + number2round1;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round1 + " + " + number2round1 + "?");
			 
			//Read their response 
			Scanner input = new Scanner(System.in);
			int userAnswer1 = input.nextInt();

		    //Check if the answer was correct
			if (userAnswer1 == correctAnswer1){
				System.out.println("Answer was correct.");
				hardnessofquestion *= 10;
				System.out.println("Score is: " + hardnessofquestion);
			}else{
				System.out.println("Answer is incorrect.");
				System.out.println("You recieved no points.");
				System.out.println("Answer was " + correctAnswer1);
			}
			
			//Round 2
			int hardnessofquestion2 = 100;
			
			//Generate 2 random numbers
			int number1round2 = (int) (Math.random () * hardnessofquestion);
			int number2round2 = (int) (Math.random () * hardnessofquestion);
			int correctAnswer2 = number1round2 + number2round2;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round2 + " + " + number2round2 + "?");
			 
			//Read their response 
			int userAnswer2 = input.nextInt();

		    //Check if the answer was correct
			if (userAnswer2 == correctAnswer2){
				System.out.println("Answer was correct.");
				hardnessofquestion *= 10;
				System.out.println("Score is: " + hardnessofquestion);
			}else{
				System.out.println("Answer is incorrect.");
				System.out.println("You recieved no points.");
				System.out.println("Answer was " + correctAnswer2);
			}
			
			//Round 3
			int hardnessofquestion3 = 1000;
			
			//Round 1
			//Generate 2 random numbers
			int number1round3 = (int) (Math.random () * hardnessofquestion);
			int number2round3 = (int) (Math.random () * hardnessofquestion);
			int correctAnswer3 = number1round3 + number2round3;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round3 + " + " + number2round3 + "?");
			 
			//Read their response 
			int userAnswer3 = input.nextInt();

		    //Check if the answer was correct and award points if necessary 
			if (userAnswer3 == correctAnswer3){
				System.out.println("Answer was correct.");
				hardnessofquestion *= 10;
				System.out.println("Score is: " + hardnessofquestion);
			}else{
				System.out.println("Answer is incorrect.");
				System.out.println("You recieved no points.");
				System.out.println("Answer was " + correctAnswer3);
			}
			//Round 4
			int hardnessofquestion4 = 1000;
			
			//Generate 2 random numbers
			int number1round4 = (int) (Math.random () * hardnessofquestion);
			int number2round4 = (int) (Math.random () * hardnessofquestion);
			int correctAnswer4 = number1round4 + number2round4;
			
			//Ask the user to add these two numbers together
			System.out.println("What is " + number1round4 + " + " + number2round4 + "?");
			 
			//Read their response 
			int userAnswer4 = input.nextInt();

		    //Check if the answer was correct
			if (userAnswer4 == correctAnswer4){
				System.out.println("Answer was correct.");
				hardnessofquestion *= 10;
				System.out.println("Score is: " + hardnessofquestion);
			}else{
				System.out.println("Answer is incorrect.");
				System.out.println("You recieved no points.");
				System.out.println("Answer was " + correctAnswer4);
			}
	}
}

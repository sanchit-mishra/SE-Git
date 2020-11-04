import java.util.*;

public class Mathematics{

	static void enterNumber(){
		System.out.println("Enter Two Number: ");
	}

	static int addition(){
		//function to perform addition of two numers - Sanchit

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		return num1 + num2;
	}
     
	static int subtraction(){
		// function to perform subtraction of two numbers - Arya
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		return num1-num2;
	}

	static int multiplication(){
		// function to perform multiplication of two numbers - Udita
	}

	static int division(){
		// function to perform division of two numbers - Omkar
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		return num1/num2;

	}

	static void displayResult(int choice, HashMap<Integer, String> operations, int result){
		System.out.println("Result of " + operations.get(choice) + " is " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, String> operations = new HashMap<Integer, String>();
		
		operations.put(1,"Addition");
		operations.put(2,"Subtraction");
		operations.put(3,"Multiplication");
		operations.put(4,"Division");
		
		System.out.println("Choose Operations");
		System.out.println("1. Addition  2. Subtraction  3. Multiplication  4. Division");
		int choice = sc.nextInt();

		switch(choice){
			case 1: enterNumber();
					int result = addition();
					displayResult(choice, operations, result);
					break;
			
			case 2: enterNumber();
					int result = subtraction();
					displayResult(choice, operations, result);
					break;
			
			case 3: enterNumber();
					int result = multiplication();
					displayResult(choice , operations, result);
					break;

			case 4: enterNumber();
					int result = division();
					displayResult(choice, operations, result);
					break;

			default: 
					System.out.println("Invalid Operations");
					break;
		}		
	}
}
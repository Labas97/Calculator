import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double result = 0;
		
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Please enter your input method:"
					+ "\n 1. Three arguments"
					+ "\n 2. One argument\n");
		
		String calculatorType= scanner.next();
		
		switch (calculatorType) {
			
			case "1":
				result=calculateWithThreeArguments();
				break;
			case "2":
				result=calculateWithOneArgument();
				break;
			default:
				System.out.println("\nPlease enter a valid calculation type!\n");
		}
		
		scanner.close();
		
		System.out.println(result);
	}
	
	public static double calculateWithThreeArguments() {
		double result = 0;
		double firstOperand = 0;
		double secondOperand = 0;
		String operator="1";
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your first operand\n");
		firstOperand=scanner.nextDouble();
		System.out.println("Please enter your second operand\n");
		secondOperand=scanner.nextDouble();
		System.out.println("Please enter your operator! (+,-,*,/)\n");
		operator=scanner.next();
		result=calculate(firstOperand, secondOperand, operator);
		
		scanner.close();
		
		return result;
	}
	
	public static double calculateWithOneArgument() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your calculation!\n");
		String calculation= scanner.nextLine();
		
		double firstOperand = Double.parseDouble(calculation.split(" ")[0]);
		double secondOperand = Double.parseDouble(calculation.split(" ")[2]);
		
		String operator=calculation.split(" ")[1];
		System.out.println(operator);
		double result=calculate(firstOperand, secondOperand, operator);
		
		scanner.close();
		
		return result;
	}
	
	public static double calculate(double firstOperand, double secondOperand, String operator) {
		double result = 0;
		switch(operator) {
		case "+":
			result=firstOperand+secondOperand;
			break;
		case "-":
			result=firstOperand-secondOperand;
			break;
		case "*":
			result=firstOperand*secondOperand;
			break;
		case "/":
			if(secondOperand!=0) {
				result=firstOperand/secondOperand;
			}
			else System.out.println("\nCannot divide with 0.\n");
		default:
			System.out.println("\nPlease enter a valid operator.\n");
		}
		return result;
	}

}
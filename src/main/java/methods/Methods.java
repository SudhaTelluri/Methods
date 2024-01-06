package methods;

public class Methods {
	public static void main(String[] args) {

		// Usage of method with Integer return type
		int rectangleArea = calRectangleArea(10, 20);
		System.out.println("Area of Rectangle is :" + rectangleArea);

		// Usage of method with String return type
		String greetingMessage = welcomeMessage("John");
		System.out.println(greetingMessage);

		// Usage of method with boolean return type
		boolean flag = evenOrNot(5);
		System.out.println("Given number is even : " + flag);

		// Usage of method with Array return type
		int[] evenNumbers = first10EvenNumbers();
		for (int evenNumber : evenNumbers) {
			System.out.println(evenNumber);
		}
		
		// Usage of method with out any return type
		substractNumbers(30,20);
	}

	// Method with Integer return type
	public static int calRectangleArea(int length, int breadth) {
		int area = length * breadth;
		return area;
	}

	// Method with String return type
	public static String welcomeMessage(String name) {
		return "Hello " + name + " Welcome to Java progrmming";
	}

	// Method with boolean return type	
	public static boolean evenOrNot(int number) {
		/*
		 * if (number % 2 == 0) { return true; } else { return false; }
		 */
		return (number % 2 == 0);
	}

	// Method with Array return type
	public static int[] first10EvenNumbers() {
		int[] evenNumbers = new int[10];
		for (int i = 0; i < evenNumbers.length; i++) {
			evenNumbers[i] = i * 2;
		}
		return evenNumbers;
	}
	
	// Method with out return type
	public static void substractNumbers(int num1,int num2) {
		int substraction=num1-num2;
		System.out.println("Substraction of two numbers are "+substraction);
	}

}

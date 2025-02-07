/*2. create a java application with a class Even having one instance method Check Even method with int parameter. If the parameter value is Even then print given value is Even else Raise user defined Exception like NotEvenNumberException as compile Time Exception. invoke checkEven method under main Method.*/

import java.util.Scanner;

// Custom checked exception

class NotEvenNumberException extends Exception {
    public NotEvenNumberException(String message) {
        super(message);
    }
}

class Even {
	public void checkEven(int number) throws NotEvenNumberException {
        	if (number % 2 == 0) {
            		System.out.println(number + " is Even.");
        	} else {

            	// Raise custom exception

            		throw new NotEvenNumberException(number + " is not an Even number.");
       		 }
    	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input from user

            System.out.print("Enter a number to check: ");
            int number = scanner.nextInt();

            // Invoke checkEven method

            new Even().checkEven(number);
        } catch (NotEvenNumberException e) {

            // Handle the custom exception

            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {

            // Handle any other exceptions

            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

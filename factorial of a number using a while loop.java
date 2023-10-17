import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        long factorial = 1; // Use 'long' to handle larger factorials
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            while (number > 0) {
                factorial *= number;
                number--;
            }
            System.out.println("Factorial: " + factorial);
        }
        
        scanner.close();
    }
}

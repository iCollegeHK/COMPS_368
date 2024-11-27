import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!000000000100001");
        System.out.println("000010010010--0000000000000");
        System.out.println("000010010010--0000000000000");

        // Read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int userNumber = scanner.nextInt();

        // Increase user input number and system input number + 10 , output the result
        int result = userNumber * 10;
        System.out.println("Result: " + result);
    }
}
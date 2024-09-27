import java.util.Scanner;

public class IT24102763Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];  
        }

        System.out.println("The numbers you entered are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

      

      
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + sum/10.0);
    }
}

import java.util.Scanner;

public class IT24102763Lab6Q3 {
    public static void main(String[] args) {
        int num, count = 0;
        double sum = 0, rms;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive numbers (Terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num == -99) {
                break;
            }
            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }
            sum += num * num;
            count++;
        }

        if (count > 0) {
            rms = Math.sqrt(sum / count);
            System.out.println("The Root Mean Square is: " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}

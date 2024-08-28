import java.util.Scanner;

public class IT24102763Lab6Q1 {
    public static void main(String[] args) {
       
        Scanner arp = new Scanner(System.in);
        
      
        System.out.println("Enter a number: ");
        double num = arp.nextInt();
       
        double sqr = num*num;
        double sqrt = Math.sqrt(num);
        

        System.out.println("The square of "+num+ " is : " +sqr);
        
        System.out.println("The square root of " +num+ " is : " +sqrt);
    }
}
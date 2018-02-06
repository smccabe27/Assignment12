import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    
    public static double total = 0;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "y";
        boolean valid = false;
        
        while(answer.equals("y") || answer.equals("Y")){
            System.out.println("Enter number to be added");
            valid = false;
            while(!valid){
                scan = new Scanner(System.in);
                try{
                    sum(scan.nextDouble());
                    valid = true;
                }
                catch(InputMismatchException e){
                    System.err.println("That's not a valid number, enter a number");
                    valid = false;
                }
            }
            answer = "";
            while(false == answer.equals("y") && false == answer.equals("Y")
                  && false == answer.equals("n") && false == answer.equals("N")){
                System.out.println("Add more numbers? (Y/N)");
                answer = scan.next();
            }
        }
        System.out.println("The sum of your inputs is " +  total);
    }
    
    public static void sum(double n){
        total += n;
    }
}
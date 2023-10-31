import java.util.Scanner;
public class factFun {
    public static void fact(int f){
        int factorial = 1;
        if(f < 0){
            System.out.println("Invalid input please insert positive number !");
        }
        for(int i = f; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial = "+factorial);
        return;
        
    }
    // Defining the main function
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int f = sc.nextInt();

        // calling the function
        fact(f);

    }
}

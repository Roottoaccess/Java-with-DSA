import java.util.Scanner;
public class greates_number {
    public static void greater(int num1,int num2)
    {
        if(num1 > num2)
        {
            System.out.print("The greater number is: "+num1);
        }
        else{
            System.out.print("The greater number is: "+num2);
        }
        return;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // calling the function
        greater(num1, num2);
    }
}

import java.util.Scanner;
public class practise_questions {
    public static void average(int x,int y,int z)
    {
        float res = (x + y + z) / 3;
        System.out.println("The average of the three number is: "+res);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Enter the third number: ");
        int z = sc.nextInt();

        // Calling the function
        average(x,y,z);
    }
}

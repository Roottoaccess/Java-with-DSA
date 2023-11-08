import java.util.Scanner;
public class voting {
    public static void vote(int age)
    {
        if(age >= 18)
        {
            System.out.print("You are eligible to vote !");
        } else {
            System.out.println("You are not eligible to vote !");
        }
        return;
    }
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Calling the function
        vote(age);
    }
}

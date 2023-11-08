import java.util.Scanner;
public class user_program {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int PositiveNumberCount = 0;
        int NegativeNumberCount = 0;
        int ZeroCount = 0;

        char choose;
        do{
            System.out.print("Enter any number you want: ");
            int number = sc.nextInt();

            if(number > 0){
                PositiveNumberCount++;
            } else if(number < 0){
                NegativeNumberCount++;
            } else {
                ZeroCount++;
            }
            System.out.println("Do you want to continue ?(y/n): ");
            choose = sc.next().charAt(0);
        } while(choose == 'y' || choose == 'Y');

        System.out.println("The number of positive number is: "+PositiveNumberCount);
        System.out.println("The number of negative number is: "+NegativeNumberCount);
        System.out.println("The number of zero's count is: "+ZeroCount);
    }
}

import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // for(int i = 0; i <= 10; i++)
        // {
        //     System.out.println(i);
        // }
        // for(int i = 0; i < 11; i++){
        //     System.out.print(i+" ");
        // }

        // While loop
        // int i = 0;
        // while(i < 11){
        //     System.out.println(i);
        //     i++;
        // }

        // Do while loop
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i < 11);

        // Task
        // System.out.println("Enter any number: ");
        // int n = sc.nextInt();
        //     int result = 0;
        // for(int i = 1; i <= n; i++)
        // {
        //     result  = result + i;
        // }
        // System.out.println("The result is = "+result);

        // Printing the table of the number given by the user
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int res = 0;
            for(int i = 1; i <= 10; i++)
            {
                res = i * x;
                System.out.println(x+" x "+i+" = "+res);
            }
    }
}

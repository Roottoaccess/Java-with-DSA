import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();

        for(int i = 0; i < limit ; i++){
            int new_num = num1 + num2;
            System.out.print(new_num+" ");
            // swap
            num1 = num2;
            num2 = new_num;
        }
        // System.out.print("The result is: ");
    }
}

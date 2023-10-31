import java.util.Scanner;
public class addFun {

    public static void addNum(int num1,int num2){
        System.out.print("The result is -> "+(num1 + num2));
        return;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // calling the function
        addNum(num1, num2);
    }
}

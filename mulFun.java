import java.util.Scanner;
public class mulFun {
    // Created function
    public static int product(int x , int y){
        int result = x * y;
        return result;
    }

    // Main function
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        // calling the function
        System.out.println("The product of 2 number is: "+ product(x, y));
    }
}

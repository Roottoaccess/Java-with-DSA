import java.util.Scanner;
public class factorial_rec {
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_nm1 = factorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.print("The factorial is: "+res);
    }
}
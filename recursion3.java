import java.util.Scanner;
public class recursion3 {
    public static void num(int i, int sum, int n){
        if(i == n){
            sum += i;
            System.out.print("The result is: "+sum);
            return;
        }

        sum += i;
        num(i+1, sum, n);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        num(1, 0, n);
    }
}

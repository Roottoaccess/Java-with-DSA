import java.util.Scanner;
public class recursion2 {
    public static void printNum(int n,int m){
        if(n == m+1){
            return;
        }
        // Printing the number
        System.out.println(n);
        // Recursion
        printNum(n+1,m);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int n = sc.nextInt();

        System.out.print("Enter the ending value: ");
        int m = sc.nextInt();
        printNum(n,m);
    }
}

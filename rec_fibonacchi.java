// import java.util.Scanner;
public class rec_fibonacchi {
    public static void rec_fibonacchi(int a,int b,int limit){
        if(limit == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        rec_fibonacchi(b , c , limit -1);

    }
    public static void main(String[]args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the limit: ");
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int limit = 10;
        rec_fibonacchi(a , b , limit - 2);
    }
}

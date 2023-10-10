import java.util.*;
public class variables {
    public static void main(String[]args){
        // Variables
        // int a = 10;
        // int b = 25;

        // int sum = a + b;

        // System.out.println(sum);
        // int diff = b - a;
        // System.out.println(diff);

        // int mul = a * b;
        // System.out.println(mul);

        // Quiz
        int a = 10;
        int b = 5;

        int cal = (a * b)/(a - b);

        System.out.println("The calculated value: "+cal);
        Scanner sc = new Scanner(System.in);
        //nextInt()
        //nextFloat()
        String name = sc.nextLine();
        System.out.println(name);
    }
}

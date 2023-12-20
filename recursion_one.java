//import java.util.Scanner;
public class recursion_one {
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        // recurtion
        printNum(n-1);
    }
    public static void main(String[]args){
        int n = 5;
        printNum(n);
    }
}

// import java.util.Scanner;
public class bitwise_operator {
    public static void main(String[]args){
        int n = 5;
        int pos = 2;

        int bitMask = 1 << 2;

        if((bitMask & n) == 0){
            System.out.print("The bit is zero");
        } else {
            System.out.print("The bit is one");
        }
    }
}

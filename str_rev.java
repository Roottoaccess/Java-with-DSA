// import java.util.Scanner;
public class str_rev {
    public static void main(String[]args)
    {
        StringBuilder sb = new StringBuilder("hello");

        for(int i = 0; i < sb.length()/2; i++){
            int first = i;
            int last = sb.length() -  1 - i;

            // Picking up the characters
            char first_char = sb.charAt(first);
            char last_char = sb.charAt(last);

            sb.setCharAt(first, last_char);
            sb.setCharAt(last, first_char);
        }
        System.out.println(sb);
    }
}

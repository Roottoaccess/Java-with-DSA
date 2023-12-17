import java.util.Scanner;
public class string_buil {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("h");
        // System.out.println(sb);

        // // Character at 0
        // // System.out.println(sb.charAt(0));

        // // set char at index
        // // sb.setCharAt(0, 'H');
        // // System.out.println(sb);

        // // Insert a character in the String
        // sb.insert(2, 'e');
        // // System.out.print(sb);

        // // Delete the extra 'e' from the string
        // sb.delete(2, 3);
        // System.out.println(sb);


        // append a character at the last we will use append function from the string builder
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');

            System.out.println(sb);
    }
}

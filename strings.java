import java.util.Scanner;
public class strings {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();

        // System.out.println("Your name is -> "+name);
        // // To find the length of the string we will use
        // System.out.println("The length of the string is: "+name.length());
        // chatAt
        // for(int i = 0; i < name.length(); i++)
        // {
        //     System.out.println(name.charAt(i));
        // }

        // Compairing the strings
        String first = "Tony";
        String second = "Tony";

        // if(first.compareTo(second) == 0){
        //     System.out.print("The 2 Strings are equal");
        // } else {
        //     System.out.print("The strings are not equal");
        // }

        // if(new String("Tony") == new String("Tony"))
        // {
        //     System.out.println("The strings are equal !");
        // } else {
        //     System.out.println("The strings are not equal !");
        // }

        // Substring method in Java
        String sentence = "This is a sentence";
        String name = sentence.substring(10,sentence.length());
        System.out.println(name);
        
        // Last but not the least (Strings are immutable)
    }
}

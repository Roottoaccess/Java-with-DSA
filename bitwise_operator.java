import java.util.Scanner;
public class bitwise_operator {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        int notbitMask = ~(bitMask);

// Get bit function:-

        // if((bitMask & n) == 0){
        //     System.out.print("The bit is zero");
        // } else {
        //     System.out.print("The bit is one");
        // }

// Set bit function:-
            // int newNumber = bitMask | n;
            // System.out.print("The result after applying the set bit function: "+newNumber);

// Clear Bit function:-
            // int newNumber = notbitMask & n;
            // System.out.print("The final result is: "+newNumber);

// Update Bit function:- 
            // For updating bit we need to take user input
            System.out.print("Enter what you want to make (1/0): ");
            int choice = sc.nextInt();

            if(choice == 0){
                int newNumber = notbitMask & n;
                System.out.print("The final output is: "+newNumber);
            } else if(choice == 1){
                int finalans = bitMask | n;
                System.out.print("The final output is: "+finalans);
            } else {
                System.out.print("Please give a valid input !");
            }
    }
}

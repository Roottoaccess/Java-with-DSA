import java.util.Scanner;
public class array_1 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        // Defining the array
        // int[] marks = new int[3];

        // marks[0] = 92;
        // marks[1] = 98;
        // marks[2] = 94;

        // System.out.println(marks);

        // Enter your marks and we will calculate the average of it
        // System.out.print("Enter how many marks you want to enter: ");
        // int x = sc.nextInt();

        // int[] marks = new int[x];

        // for(int i = 0; i < x; i++)
        // {
        //     System.out.print("Enter the marks: ");
        //     marks[i] = sc.nextInt();
        // }
        // System.out.println("The numbers are !");
        // for(int i = 0; i < x; i++)
        // {
        //     System.out.println(marks[i]);
        // }

        // System.out.println("Your entered marks are -> ");
        // for(int i = 0; i < x; i++)
        // {
        //     System.out.println(marks[i]);
        // }
            // Null value initialization in array
        // System.out.print("Enter the range: ");
        // int size = sc.nextInt();

        // int[] numbers = new int[size];

        //     for(int i = 0; i <= size; i++)
        //     {
        //         System.out.println(numbers[i]);
        //     }
        // System.out.print("Enter the limit: ");
        // int x = sc.nextInt();
        // int marks[] = new int[x];
            
        //     for(int i = 0; i < x; i++)
        //     {
        //         System.out.print("Enter the value one by one: ");
        //         marks[i] = sc.nextInt();
        //     }
        // // Printing the array
        // System.out.println("The inputed array are !");
        // for(int i = 0; i < x; i++)
        // {
        //     System.out.println(marks[i]);
        // }

        // Predifine array
        // int age[] = {20,22,24};

        // for(int i = 0; i < 3; i++)
        // {
        //     System.out.println(age[i]);
        // }

            // Taking an array and travelling the total array and then taking an input 
            // from the user and search that the input is present in the array or not 
            // and then -> 
            // return the index number of the value found !!

            System.out.print("Enter the limit of the array: ");
            int lmt = sc.nextInt();
            
            // Defining the array
            int number[] = new int[lmt];

            // Taking the input from the user
            for(int i = 0; i < lmt; i++){
                System.out.print("Enter the number one by one: ");
                number[i] = sc.nextInt();
            }
            System.out.print("Enter the number you want to find the index of: ");
            int x = sc.nextInt();

            for(int i = 0; i < number.length; i++)
            {
                if(x == number[i]){
                    System.out.println("The index number is: "+i);
                }
            }
    }
}

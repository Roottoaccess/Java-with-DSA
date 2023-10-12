import java.util.Scanner;
public class loop_homeworks {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();

        // for(int i = 2; i <= n; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }

        // Infinity loop program
        // for(; ;) {
        //     System.out.println("Apna College");
        // }
            // Menu driven program
            int input;
            do{
                System.out.print("Enter the marks: ");
                int marks = sc.nextInt();
                    if(marks >= 90 && marks <= 100){
                        System.out.println("This is Good");
                    } else if(marks >= 60 && marks <= 89){
                        System.out.println("This is also good");
                    } else if(marks >= 0 && marks <= 59){
                        System.out.println("This is good as well");
                    } else {
                        System.out.println("Invalid input please check");
                    }
                    System.out.print("Do you want to continue ? (press 1 to continue or 0 to end): ");
                    input = sc.nextInt();
            }while(input == 1);
            if(input == 0){
                System.out.println("Hope you enjoy the output :) ");
            }
            
    }
}

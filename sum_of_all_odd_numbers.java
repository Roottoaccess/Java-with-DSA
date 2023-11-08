import java.util.Scanner;
public class sum_of_all_odd_numbers {
    public static void add(int n){
        // Logic behind the program
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0)
            {
                count = count + i; 
            }
        }
        System.out.print("The result is : "+count);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Calling the function
        add(n);
    }
}

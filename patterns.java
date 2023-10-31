import java.util.Scanner;
public class patterns {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Solid Rectangle
        // for(int i = 1;i <= m;i++){
        //     for(int j = 1; j <= n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

        // Hollow Rectangle
        // for(int i = 1; i <= m; i++){
        //     // inner loop
        //     for(int j = 1; j <= n;j++){
        //         // cell(i,j)
        //         if(i == 1 || j == 1 || i == m || j == n){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Half pyramid
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid
        // for(int i = m; i >= 1; i--){
        //     for(int j = i; j >= 1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // Inverted half pyramid
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1 ; j <= m-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j <= i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Half pyramid with number
        /*
        1
        12
        123
        1234
        12345
        */
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        // Inverted half pyramid with numbers
        // for(int i = m; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Floyd's Triangle
        // int number = 1;
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // 0 - 1 triangle
        // for(int i = 1; i <= m; i++)
        // {
        //     for(int j = 1; j <= i; j++){
        //         int sum = i + j;
        //             if(sum % 2 == 0){
        //                 System.out.print(1+" ");
        //             }
        //             else{
        //                 System.out.print(0+" ");
        //             }
        //     }
        //     System.out.println();
        // }

        // Making a butterfly pattern
        // Upper half
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     int space = 2 * (m - i);

        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // inverted and 2nd part
        // for(int i = m; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     int space = 2 * (m - i);

        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Solid Rhombus
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= m-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Making a number Pyramid
        // for(int i = 1; i <= m; i++){
        //     // Space printing
        //     for(int j = 1; j <= m-i; j++){
        //         System.out.print(" ");
        //     }
        //     // Number printing
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Making a Palindromic Pattern
        // for(int i = 1; i <= m; i++){
        //     // Printing the spaces
        //     for(int j = 1; j <= m-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j = 2; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Making a Diamond Pattern
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= m-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = m; i >= 1; i--){
        //     for(int j = 1; j <= m-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Making a Hollow Butterfly
        // for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == j *j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     int space = 2 * (m - i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == j *j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i = m; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == j *j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     int space = 2 * (m - i);
        //     for(int j = 1; j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         if(j == i || j == j *j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
import java.util.Scanner;
public class practise_pattern
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
// Solid rectangle
        // for(int i = 1; i <= m; i++)
        // {
        //     for(int j = 1; j <= n; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

        // Hollow Rectangle
        // for(int i = 1; i <= m; i++)
        // {
        //     for(int j = 1; j <= n;j++)
        //     {
        //         if(i == 1||j == 1||i == m||j == n){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Half Pyramid
        // for(int i = 1; i <= m; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted half 
        // for(int i = m; i >= 1; i--)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted half Pyramid
        for(int i = 1; i <= m; i++)
        {
            // Printing the space(inner loop)
            for(int j = 1; j <= m-i; j++){
                System.out.print(" ");
            }
            // Printing the star(2nd inner loop)
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
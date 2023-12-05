import java.util.Scanner;
public class metrics_addition {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        // Making a 2D Metrics
        int number[][] = new int[row][col];

            // Taking the input
            for(int i = 0; i < row; i++)
            {
                for(int j =0; j < col; j++){
                    System.out.print("Enter the elements of the 1st metrics: ");
                    number[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    System.out.print(number[i][j]+" ");
                }
                System.out.println();
            }
System.out.println("Now Enter the second metrics !");
        // Taking the input of the second array

        System.out.print("Enter the number of row: ");
        int row1  = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int col1 = sc.nextInt();

        int number2[][] = new int[row1][col1];
            
                for(int i = 0; i < row1; i++)
                {
                    for(int j = 0; j < col1; j++)
                    {
                        System.out.print("Enter the elements of the 2nd metrics: ");
                        number2[i][j] = sc.nextInt();
                    }
                }

                for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    System.out.print(number2[i][j]+" ");
                }
                System.out.println();
            }
            // operation metrics
             int result[][] = new int[row][col];
            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    result[i][j] = number[i][j] + number2[i][j];
                }
            }
            System.out.println("The result metrics is !");
            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
    }
}

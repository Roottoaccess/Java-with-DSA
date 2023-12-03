import java.util.*;
class Two_d_array{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of the metrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the column of the metrix: ");
        int col = sc.nextInt();

            int [][] number = new  int[row][col];
        // Input of the array
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your entered matrix is -> ");
        // Output of the array
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

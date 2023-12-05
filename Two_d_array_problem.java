import java.util.Scanner;
class Two_d_array_problem{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row you want: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of col you want: ");
        int col = sc.nextInt();

        // Creating a 2D Array
        int number[][] = new int[row][col];

        // Taking the input from the array
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++){
                System.out.print("Enter the elements of the metrics: ");
                number[i][j] = sc.nextInt();
            }
        }
        // Printing the inputed metrics
        System.out.println("Your metrics formed is: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

        // Printing the index number of the inputed element from the metrics
        System.out.print("Enter the element of which you want to find the index number: ");
        int find = sc.nextInt();

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(number[i][j] == find){
                    System.out.println("Your entered number index value are: ("+ i +","+ j+")");
                }
            }
        }
    }
}
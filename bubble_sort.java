import java.util.Scanner;
public class bubble_sort {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements one by one: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // bubble sort logic
        for(int i = 0; i < arr.length - 1; i++){
            // arr.length -i -1 because we need to apply the inner loop for the non sorted
            // elements and the sorted elements is equal to the count of i;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    // if the condition be true then swaping will take place to move the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Now printing the elements
        System.out.println("Your sorted array is !");
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
    }    
}

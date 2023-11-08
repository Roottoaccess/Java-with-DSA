import java.util.Scanner;
public class circumference_of_circle {
    public static void circumference(int radius){
        double result = 2* radius * 3.14;
        System.out.print("The circumference is: "+result);
        return;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();

        // Calling the function
        circumference(radius);
    }
}

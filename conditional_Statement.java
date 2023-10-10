import java.util.Scanner;
public class conditional_Statement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // Checking the person is adult or not
        // System.out.print("Enter your age: ");
        // int age  = sc.nextInt();
        // // Now appling the conditional statement
        // if(age >= 18){
        //     System.out.println("You are an adult");
        // }
        // else{
        //     System.out.println("You are not an adult");
        // }
        // System.out.println("Enter any number: ");
        // int num = sc.nextInt();

        // if(num % 2 == 0){
        //     System.out.println("Even number !");
        // }
        // else{
        //     System.out.println("Odd number !");
        // }
        // System.out.print("Enter the value of a: ");
        // float a = sc.nextFloat();
        // System.out.print("Enter the value of b: ");
        // float b = sc.nextFloat();

        // if(a == b){
        //     System.out.println("a is equal to b !");
        // }
        // else if(a > b){
        //     System.out.println("a is greater than b !");
        // }
        // else
        // {
        //     System.out.println("a is lesser than b !");
        // }

        System.out.println("Press the bottons 1 or 2 or 3: ");
        int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // } else if(button == 2){
        //     System.out.println("Namaste");
        // } else if(button == 3){
        //     System.out.println("Bonjour");
        // } else{
        //     System.out.println("Invalid button !");
        // }

        //switch case
        switch(button){
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default:
            System.out.println("Invalid button");
        }
    }
}

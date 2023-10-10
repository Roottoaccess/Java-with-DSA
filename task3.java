import java.util.*;
public class task3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // making a calculator
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation--*-- ");
        System.out.println("Press 1 for addition"); 
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 from multiply");
        System.out.println("Press 4 from division");
        System.out.println("Pres 5 for remender !");
            int opp = sc.nextInt();
        int result = 0;
        switch(opp){
            case 1:
            result = a + b;
            System.out.println(result);
            break;
            case 2:
            result = a - b;
            System.out.println(result);
            break;
            case 3:
            result = a * b;
            System.out.println(result);
            break;
            case 4:
            result = a / b;
            System.out.println(result);
            break;
            case 5:
            result = a % b;
            System.out.println(result);
            break;
            default:
            System.out.println("Entered an invalid number !");
        }

        // Question 2
        System.out.print("Enter the number I will print the month: ");
        int month = sc.nextInt();

        switch(month){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
            default:
            System.out.println("Enter a valid number according to the month !");
        }
    }
}

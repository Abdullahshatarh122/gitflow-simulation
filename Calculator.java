import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        System.out.println("** This a calculator program that can do +,-,*,/ operations");
        double num1 = 0 , num2 = 0 ;
        Character operation ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number : ");
        num2 = scanner.nextDouble();
        System.out.println("Enter the operation : ");
        operation = scanner.next().charAt(0);
        if (operation == '+'){
            System.out.print("The output is : ");
            System.out.println(num1 + num2);
        }
        else if (operation == '-'){
            System.out.print("The output is : ");
            System.out.println(num1 - num2);
        }
        else if (operation == '*'){
            System.out.print("The output is : ");
            System.out.println(num1 * num2);
        }
    }
}
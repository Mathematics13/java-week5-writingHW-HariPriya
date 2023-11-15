package program1_calculate;

import java.util.Locale;
import java.util.Scanner;

//Program 1
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                                           //Declaring the scanner object
        String answer;
        do
        {
            System.out.println("Please enter first number : ");                                           //input wizard
            int a = scanner.nextInt();
            System.out.println("please enter second number : ");                                         //input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter one symbol from +,-,*,/ : ");                               //input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N' : ");      //input wizard
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while(answer.startsWith("Y"));
        scanner.close();                                                                                 //closing the scanner object
    }
}

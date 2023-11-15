package java_week5;

import java.util.ArrayList;
import java.util.Scanner;

/** Program 6
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Program6_RetrieveArrayListAtGivenIndex
{
    public static void main(String[] args)
    {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINJAL");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER-GUARD");

        System.out.println( vegetableList);
        Scanner scan = new Scanner(System.in);                                          //scanner declaration
        System.out.println("Please enter an index number : ");                         //input wizard
        int index = scan.nextInt();

        if(index<vegetableList.size())
        {
            System.out.println(vegetableList.get(index));
        }
        else
        {
            System.out.println("Invalid Index ");
        }
        scan.close();                                                               //closing the scanner object
    }
}

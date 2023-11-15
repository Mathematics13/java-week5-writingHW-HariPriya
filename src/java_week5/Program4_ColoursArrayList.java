package java_week5;

import java.util.ArrayList;

/** Proghram 4
 * Write a Java program to create a new array list, add some colours (string)
 and printout the collection using for each loop.
 */

public class Program4_ColoursArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("RED");
        colourList.add("BLUE");
        colourList.add("RED");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");

        for (  String colours   : colourList      )
        {
            System.out.print(colours + " , " );
        }
    }
}

package java_week5;

import java.util.ArrayList;

/** Program 7
 * Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */

public class Program7_UnderGroundTubeNames
{
    public void isEmpty()
    {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo-lines");
        tubeNames.add("Central-lines");
        tubeNames.add("Circle-lines");
        tubeNames.add("District-lines");
        tubeNames.add("Hammersmith-and-City-lines");
        tubeNames.add("Jubilee-lines");
        tubeNames.add("Metropolitan-lines");
        tubeNames.add("Northern-lines");
        tubeNames.add("Piccadilly-lines");
        tubeNames.add("Victoria-lines");
        tubeNames.add("Waterloo-and-City-lines");

        System.out.println("Given Array List : " +tubeNames);
        if(tubeNames.isEmpty())
        {
            System.out.println("Given Array List is Empty ");
        }
        else
        {
            System.out.println("Given Array List is not empty");
        }
    }

    public static void main(String[] args)
    {
        Program7_UnderGroundTubeNames obj = new Program7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}

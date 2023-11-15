package java_week5;

import java.util.HashMap;
import java.util.Map;

/**  Program 9
 * Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */

public class Program9_HashMap
{
    public static void main(String[] args)
    {

        HashMap<String , Integer> people = new HashMap<>();                                          //Output is Random order
        people.put("Monday" , 102) ;                                                                 //Add keys and values (Name, ID)
        people.put("Tuesday" , 103);
        people.put("Wednesday" , 104);                                                             //insertion order is not preserved
        people.put("Thursday" , 105);
        people.put("Friday" , 106);
        people.put("Saturday" , 107);
        people.put("Sunday" , 108);

        for (Map.Entry <String,Integer>  peopleNumber : people.entrySet())
        {
            System.out.println( peopleNumber.getKey() + "  " + peopleNumber.getValue());
        }
    }
}

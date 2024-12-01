/*######## Description ########################
original_list: [krishna, Ram, vishnu, Hanuman]
Reversed List: [Hanuman, vishnu, Ram, krishna]
###############################################
 */
import java.util.*;
public class reverse {
    public static void main(String[] args) 
    {
        List<String> listofstring = new ArrayList<>();
        listofstring.add("krishna");
        listofstring.add("Ram");
        listofstring.add("vishnu");
        listofstring.add("Hanuman");
        System.out.println("original_list: " + listofstring);
        List<String> reversedList = new ArrayList<>();
         for (int i = listofstring.size() - 1; i >= 0; i--) 
        {
                reversedList.add(listofstring.get(i));
        }
     
        System.out.println("Reversed List: " + reversedList);
 
    }
}

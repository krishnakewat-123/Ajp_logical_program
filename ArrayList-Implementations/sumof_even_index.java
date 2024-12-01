/*####### Description #########################
arraylist number:[4, 5, 6, 7, 8, 9, 3, 2, 2, 2]
sum of number of even index=23
#################################################
 */
import java.util.*;
public class sumof_even_index 
{   public static void main(String[] args) 
    {   int i,SUM=0,number;
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>arrnumber =new ArrayList<>();
        System.out.println("now enter the number in arraylist:");
        for(i=0;i<10;i++)
        {  
             number=sc.nextInt();
            arrnumber.add(number);// for adding the number in the arraylist (user inpur);
        }
        System.out.println("arraylist number:"+ arrnumber);
        for(i=0;i<arrnumber.size();i++)
        {   if(i%2==0)
            {
                SUM+=arrnumber.get(i);
            }

        }
        System.out.println("sum of number of even index="+SUM);
    }
}

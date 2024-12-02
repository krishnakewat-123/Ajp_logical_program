/*########## Description #####
input:madam
output: string is palindrome
##############################
 */
import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
         int i;
        boolean check=false;
        System.out.print("enter the string:");
        String str=sc.nextLine();// input string 
        System.out.println("input:"+str);
        for(i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))// logic = krirk... -> k==k, r==r;
            {   

            }
            else
            {   check=true;// break the condition if character not equal
                break;
            }
        }
        if(check)
        {
            System.out.print("output: string is not palindrome");
        }
        else
        {
            System.out.print("output: string is palindrome");
        }
       
    }
}

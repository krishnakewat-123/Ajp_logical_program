/* ################## Description ###############################
 Print a Pattern: Write a program to print the following pattern: 
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5.
#################################################################
 */
import java.util.Scanner;
public class logic 
{  public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int row,col,number;// vaiables row, col and number
        System.out.print("enter the number of row:");
        number=sc.nextInt();// taking input (number of row)
        System.out.print("outpur is :\n");
        for(row=1;row<=number;row++)
        {   
            for(col=1;col<=row;col++)
            {
                System.out.print(row+" ");
            }
            
        System.out.println();// for next line
        }
    }
}

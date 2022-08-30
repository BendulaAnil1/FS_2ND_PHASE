In a contest, There are N people stand in a row, at positions 0,1,2,...,N-1.
The person at i-th  position in the row, assigned a number by the organizer number[i].

Initially, each person has zero credits with them.
Your task is to find number of credits each person will earn at the end.

Credits[i]=product of all numbers from number[], except number[i].

Note: Credits can be positive ,negative or remains zero.

Input Format:
-------------
A space separated integer array, number[]

Output Format:
--------------
Print an integer array, credits[].


Sample Input:
---------------
1 2 5 7

2 3 4 5

-2 -1 0 1 2




Sample Output:
----------------
70 35 14 10
  
  
  
  
  import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        
        int prod=1,without=1;
        int zeroidx=-1;
        for(int i=0;i<str.length;i++)
        {
            int val=Integer.parseInt(str[i]);
            
            if(val==0)
            zeroidx=i;
            
            if(val!=0)  
                without*=val;
            
            prod*=val;
        }
        
        for(int i=0;i<str.length;i++)
        {
            int val=Integer.parseInt(str[i]);
            if(i<zeroidx)
            {
                System.out.print(0+" ");
                continue;
            }
            if(val==0)
            {
                System.out.print(without+" ");
                continue;
            }
            
            val=prod/val;
            System.out.print(val+" ");
        }
        
    }
}

Somu is given few numbers and he is supposed to give the count of the number of 
sub-numbers that have an odd product.

input = 5 1 2 3 4
output = 4

the sub-numbers with odd product are [5],[1],[3],[5,1]    
the count of those numbers is 4. 

the first line of input contains the group of numbers 


import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split("\\s+");
                int cnt=0,res=0;
            for(int j=0;j<str.length;j++)
            {
             int temp=Integer.parseInt(str[j]);
             if((temp&1)==1)
             cnt++;
             else
             {
                 res+=(cnt*(cnt+1))/2;
                 cnt=0;
             }
             
            }
            res+=(cnt*(cnt+1))/2;
        System.out.println(res);
    }
}

write a program to prrint the following pattern for any given integer n

input = 4
********
#******#
##****##
###**###
########



input = 7
output = 
**************
#************#
##**********##
###********###
####******####
#####****#####
######**######
##############



import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String decoded=new String(new char[n*2]).replace("\0","*"); //masking string with * upto n*2 size
        
        StringBuilder sb[]=new StringBuilder[n+1];  //assuming as 2d array
        for(int i=0;i<sb.length;i++)
            sb[i]=new StringBuilder(decoded);  //appending decoded string to the builder array
      
        int start=1,end=(n*2)-1;
        for(int i=1;i<sb.length;i++)
        {
            for(int j=0;j<(n*2);j++)
            {
                if(j<start)
                    sb[i].setCharAt(j,'#');
                if(j>=end)
                  sb[i].setCharAt(j,'#');  
            }
            start++;
            end--;
        }
        for(StringBuilder s:sb)
            System.out.println(s);
    }
}

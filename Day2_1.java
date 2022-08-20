Vinith a fifth class student is given a maths assingment by his school teacher. 

The maths teacher gave the following equations and asked the Vinith to solve for any given 
integer 'n'. 

    f(num)= 1, num=0
    f(num)=f(num-1)-1, if num is odd
    f(num)=f(num-1)+num, if num is even 
    
Assume the number given by the math teacher is always >=0

Help Vinith solve the problem given by his maths teacher 
Use Recursion. 


input=9
outut = 16

input=24
output=125





import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(find(n));
    }
    public static int find(int n)
    {
        if(n==1)
        return 0;
        
        if((n&1)>0)
        return find(n-1)-1;
        else
        return find(n-1)+n;
    }
}

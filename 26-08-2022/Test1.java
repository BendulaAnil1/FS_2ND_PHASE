Given an array arr[] of size n containing integers. 
find the length of the longest sub-array which is contigous  having sum equal to the given value k.

Examples:

input =10 5 2 7 1 9  
15
output = 4

Explanation -
The sub-array is {5, 2, 7, 1}.

input =-5 8 -14 2 4 12
-5
output = 5

Explanation - The sub-array is  {-5, 8, -14, 2, 4}

For all boundary conditions print -1 

  
  
  import java.util.*;
class Test1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int sum=sc.nextInt();
        int max=-99999;
        
        int arr[]=new int[s.length];
        for(int i=0;i<arr.length;i++)
        arr[i]=Integer.parseInt(s[i]);
        
        for(int i=0;i<arr.length;i++)
        {
            int cnt=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                cnt+=arr[j];
                
                if(cnt==sum)
                {
                    max=Math.max(max,(j-i)+1);
                }
            }
        }
        System.out.println(max==-99999?-1:max);
    }
}

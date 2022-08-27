Well formed groupings are as follows, (), [], {}, {()}, {[]()}, {[]}(), etc.

You will be given a string S, return true if the string S is a well formed 
grouping, otherwise false.

Note: S contains only characters ( ) [ ] { }

Input Format:
-------------
A string S, contains only characters (){}[]

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
{[([])[]]}

Sample Output-1:
----------------
true


Sample Input-2:
---------------
{[([])[]}]

Sample Output-2:
----------------
false




import java.util.*;
class Test2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Character> st=new Stack<>();
        
        String str=sc.next();
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else if(st.size()>0&&st.peek()=='('&&ch==')')
            st.pop();
            else if(st.size()>0&&st.peek()=='{'&&ch=='}')
            st.pop();
            else if(st.size()>0&&st.peek()=='['&&ch==']')
            st.pop();
            else
            st.push(ch);
        }
        System.out.println(st.isEmpty());
    }
}

A street seller selling Ganesh idols made of three distinct materials: 
Turmeric Ganesha, Clay Ganesha, and PoP Ganesha (Plaster of Paris). 
Each ganesha is identifiable by a code: 0 = Turmeric, 1 = Clay, 2 = PoP.

The seller has received the idols in a line. He must organise the idols
such that all of the idols made of the same material are put together as a group.

Your task is to help the seller, to arrange the idols in the following order,
Group-1: Turmeric Ganesha, Group-2: Clay Ganesha, Group-3: PoP Ganesha 


INPUT FORMAT:
-------------
Line-1: An integer N, number of idols.
Line-2: N comma separated integers, Initial arrangement of Idols.

OUTPUT FORMAT:
--------------
Print the grouped order of Idols.


SAMPLE INPUT-1:
---------------
6
0,2,1,1,2,0

SAMPLE OUTPUT-1:
----------------
[0, 0, 1, 1, 2, 2]


SAMPLE INPUT-2:
---------------
8
0,1,2,1,2,1,2,0

SAMPLE OUTPUT-2:
----------------
[0, 0, 1, 1, 1, 2, 2, 2]



A street seller selling Ganesh idols made of three distinct materials: 
Turmeric Ganesha, Clay Ganesha, and PoP Ganesha (Plaster of Paris). 
Each ganesha is identifiable by a code: 0 = Turmeric, 1 = Clay, 2 = PoP.

The seller has received the idols in a line. He must organise the idols
such that all of the idols made of the same material are put together as a group.

Your task is to help the seller, to arrange the idols in the following order,
Group-1: Turmeric Ganesha, Group-2: Clay Ganesha, Group-3: PoP Ganesha 


INPUT FORMAT:
-------------
Line-1: An integer N, number of idols.
Line-2: N comma separated integers, Initial arrangement of Idols.

OUTPUT FORMAT:
--------------
Print the grouped order of Idols.


SAMPLE INPUT-1:
---------------
6
0,2,1,1,2,0

SAMPLE OUTPUT-1:
----------------
[0, 0, 1, 1, 2, 2]


SAMPLE INPUT-2:
---------------
8
0,1,2,1,2,1,2,0

SAMPLE OUTPUT-2:
----------------
[0, 0, 1, 1, 1, 2, 2, 2]



import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=sc.next().split(",");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

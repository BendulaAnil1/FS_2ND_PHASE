Venkatesh is a maths teacher.
He is teaching matrices concept to his students.
He is given a matrix of size m*n, and it contains only positive numbers.
He has given a task to his students to find the number of special matrices 
in the given matrix A[m][n].

A special matrix has following property:
	- The size of matrix should be 3*3,
	- The sum of elements in each row, each column and 
	  the two diagonals are equal.
    - magic square
	- The 3*3 matrix should contains all the numbers from 1 to 9.
	
Your task is to help the students to find the number of speical matrices
in the given matrix.

Input Format:
-------------
Line-1: Two space separated integers M and N, size of the matrix.
Next M lines: N space separated integers m and n.

Output Format:
--------------
Print an integer, number of the special matrices.


Sample Input-1:
---------------
4 5

6 8 1 6 8
7 3 5 7 3
2 4 9 2 4
6 8 1 6 8





Sample Output-1:
----------------
1

Explanation:
------------
The special square is:
8 1 6
3 5 7
4 9 2


Sample Input-2:
---------------
3 5
2 7 6 7 2
9 5 1 5 9
4 3 8 3 4

Sample Output-2:
----------------
2

Explanation:
------------
The special squares are:
2 7 6
9 5 1
4 3 8
-----
6 7 2
1 5 9
8 3 4

  
  
  import java.util.*;
class Test
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int grid[][]=new int[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        grid[i][j]=sc.nextInt();
        
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<m-2;j++)
            {
                if(isSquare(i,j,grid))
                count++;
            }
        }
        System.out.println(count);
        
    }
    
    public static boolean isSquare(int row,int col,int grid[][])
    {
    
    int[] record=new int[10];
        for (int i=row;i<row+3;i++) {
            for (int j=col;j<col+3;j++) {
                if (grid[i][j]<1||grid[i][j]>9||record[grid[i][j]]>0) {
                    return false;
                }
                record[grid[i][j]] = 1;
            }
        }
        int sum1=grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2];
        int sum2=grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col];
        if (sum1!=sum2) 
        {
            return false;
        }
        for (int i=0;i<3;i++) {
            if (grid[row+i][col]+grid[row+i][col+1]+grid[row+i][col+2]!=sum1) 
                return false;
            if (grid[row][col+i]+grid[row+1][col+i]+grid[row+2][col+i]!=sum1)
                return false;
        }
        return true;
    }
    
}
  
  

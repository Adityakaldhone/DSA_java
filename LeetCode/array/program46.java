/*
 Transpose of Matrix
Company: MakeMyTrip, InfoEdge, Bloomberg
Platform: GFG
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is
obtained by changing rows to columns and columns to rows.
Example 1:
Input:
N = 4
mat[][] = {{1, 1, 1, 1},
{2, 2, 2, 2}
{3, 3, 3, 3}
{4, 4, 4, 4}}
Output:
{{1, 2, 3, 4},
{1, 2, 3, 4}
{1, 2, 3, 4}
{1, 2, 3, 4}}
Example 2:
Input:
N = 2
mat[][] = {{1, 2},
{-9, -2}}
Output:
{{1, -9},
{2, -2}}
Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 103
-109 <= mat[i][j] <= 109
 */ 
class Solution
{
    public void transpose(int n,int a[][])
    {
        
        int arr[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                
                arr[i][j] = a[j][i];    
            }
        }
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<arr[i].length;j++){
                
                a[i][j] = arr[i][j];
            }
        }
    }
}

There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.



code:

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = -1;
            }
        }
        int i=0;
        int j=0;
        int count = counts(i,j,m,n, arr);
        return count;
        
    }
    public int counts(int i, int j,int m, int n,int[][] arr){
         if(i==m-1 && j==n-1){
            return 1;
         }else if(i>=m || j>=n){
            return 0;
         }
         if(arr[i][j]!=-1){
            return arr[i][j];
         }else{
            return arr[i][j]=counts(i+1,j,m,n,arr)+counts(i,j+1,m,n,arr);
         }
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	 public int solve(int a1[], int a2[], int n, int m, int dp[][]) {
	     
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<m+1;j++){
                if(a1[i-1] == a2[j-1]) dp[i][j] = a1[i-1]+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        return dp[n][m];
    }
    
    public int maxSumIS(int arr[], int n) {  
        //code here.
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<n;i++) set.add(arr[i]);
        
        int m = set.size();
        int arr1[] = new int[m];
        int j = 0;
        for(int el : set){
            arr1[j] = el;
            j++;
        }
        
        Arrays.sort(arr1);
        int dp[][] = new int[n+1][m+1];
        for(int i = 0;i<n+1;i++) Arrays.fill(dp[i], 0);
        return solve(arr, arr1, n, m, dp);
    }  
}
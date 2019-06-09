// This is the Geeks fro Geeks version of the problem

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        
        for(int count = 0; count < T; count++){
            
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split("\\s+");
            int[] arr = new int[n];
            
            int u = 0;
            for(String num : line){
                arr[u++] = Integer.parseInt(num);
            }
            
            int[][] ans = new int[n+1][n+1];
            
            for(int i = 1; i < 2; i++){
                for(int j = 1; j < n+1; j++){
                    ans[i][j] = 1;
                    ans[j][i] = 1;
                }
            }
            
            int maxv = 0;
            
            for(int i = 2; i < n+1; i++){
                for(int j = 2; j < n+1; j++){
                    ans[i][j] = 1 + maxNum(arr,ans,i,j);
                    maxv = Math.max(ans[i][j],maxv);
                }
            }
            System.out.println(maxv);
        }
	}
	static int maxNum(int[] arr, int[][] ans,int row, int col){
	    int max = 0;
	    for(int i = 1; i < row; i++){
	        
	        max = arr[i-1] < arr[row-1] ? Math.max(ans[i][col-1],max) : max;
	    }
	    return max;
	}
}
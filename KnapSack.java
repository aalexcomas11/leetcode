// 0-1 KnapSack Geeks for Geeks version

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		final int T = Integer.parseInt(br.readLine());
		
		for(int c = 0; c < T; c++){
		    int n = Integer.parseInt(br.readLine());
		    int k = Integer.parseInt(br.readLine());
		    
		    String[] line = br.readLine().split("\\s+");
		    String[] line2 = br.readLine().split("\\s+");
		    int[] v = new int[n];
		    int[] w = new int[n];
		    
		    for(int i = 0; i < n; i++){
		        v[i] = Integer.parseInt(line[i]);
		        w[i] = Integer.parseInt(line2[i]);
		    }
		    
		    int[][] ans = new int[n+1][k+1];
		    
		    for(int col = 1; col < n+1; col++){
		        for(int row = 1; row < k+1; row++){
		            ans[col][row] = row - w[col - 1] < 0? ans[col-1][row] : Math.max(v[col-1] + ans[col-1][row - w[col - 1]], ans[col-1][row]);
		        }
		    }
		    
		    System.out.println(ans[n][k]);    
		}
	}
}
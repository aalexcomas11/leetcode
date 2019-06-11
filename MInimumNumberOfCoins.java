// Geeks for Geeks version. Values print in order when they should print in reverse order, otherwise correct.

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
		
		for(int c = 0; c < T; c++){
		    
		    int r = Integer.parseInt(br.readLine());
		    
		    int[] ans = new int[r+1];
		    int[] pointers = new int[r+1];
            Arrays.fill(ans,r+1);
            ans[0] = 0;
		    
		    for(int i = 1 ; i < r+1; i++){
		        for(int j = 0; j < coins.length; j++){
		            if(i - coins[j] < 0){
		                continue;
		            }
		            if(1 + ans[i - coins[j]] < ans[i]){
		                ans[i] = 1 + ans[i - coins[j]];
		                pointers[i] = j;
		            }
		        }
		    }

        if(ans[r] == r+1){
          System.out.println("");
          continue;
        }

        int k = r;

        while(k > 0){
          System.out.print(coins[pointers[k]]);
          k -= coins[pointers[k]];
          if(k > 0){
            System.out.print(" ");
          }
        }
        System.out.println("");
		}
	}
}
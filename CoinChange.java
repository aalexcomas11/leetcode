import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] r = new int[amount +1];
        Arrays.fill(r,amount+1);
        r[0] = 0;
        Arrays.sort(coins);
        
        for(int i = 1; i < amount+1; i++){
            for(int cc : coins){
                
                if(i - cc < 0){
                    break;
                }
                
                r[i] = Math.min(r[i],r[i -cc]+1);
            }
        }
        
        return r[amount] > amount ? - 1 : r[amount]; 
        
    }
}
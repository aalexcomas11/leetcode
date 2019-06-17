// DP O(n^2) solution, took about an hour. O(n) solution exist with up & down array

import java.util.*;

class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        
        int[] vals = new int[nums.length];
        Arrays.fill(vals,1);
        boolean[] bools = new boolean[nums.length];
        int max = 1;
        
        for(int j = 1; j < nums.length; j++){
            for(int i = 0; i < j; i++){
                
                if(nums[i] == nums[j]){
                    continue;
                }
                
                boolean currb = nums[j] >= nums[i];
                
                if(i == 0 || currb != bools[i]){
                    
                    if(vals[i] + 1 >= vals[j]){
                        bools[j] = currb;
                    }
                    
                    vals[j] = Math.max(vals[i] + 1, vals[j]);
                    
                    if(max < vals[j]){
                        max = vals[j];
                    }
                    
                }
            }
        }
        
        return max;
    }
}
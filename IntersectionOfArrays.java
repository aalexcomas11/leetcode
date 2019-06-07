import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> table = new HashMap<>();
        
        for(int num : nums1){
            if(!table.containsKey(num)){
                table.put(num,1);
            }
            else{
                table.put(num, table.get(num)+1);
            }
        }
        
        int[] ans = new int[Math.min(nums1.length,nums2.length)];
        int i = 0;
        
        for(int num: nums2){
            
            if(table.containsKey(num) && table.get(num) > 0){
                ans[i++] = num;
                table.put(num, table.get(num)-1);
            }
        }
        
        return Arrays.copyOf(ans,i);
    }
}
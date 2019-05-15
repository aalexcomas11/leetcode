import java.util.*;
//solution needs to be refactored
class SummaryRanges {
    public static void main(String[] args) {

        int[][] test = {
            {0,1,2},
            {0,1,2,4},
            {2,7,9},
            {0,1,2,4,5,7},
            {0,2,3,4,6,8,9}
        };

        for(int[] t : test){
            summaryRanges(t);
        }

    }
        static public List<String> summaryRanges(int[] nums) {

            int i = 0;
            ArrayList<String> ans = new ArrayList<>();

            while(i < nums.length){
                for(int j = i+1; j < nums.length; j++){
                    if(j + 1 == nums.length){
                        if(j - i > 1){
                            if(nums[j] == nums[i] + j){
                                ans.add(nums[i]+"->"+nums[j]);
                            }
                            else{
                                ans.add(nums[i]+"->"+nums[j-1]);
                                ans.add(nums[j]+"");
                            }
                        }
                        else{
                            ans.add(nums[j]+"");
                        }
                    }
                   else if(nums[j] != nums[i] + j){
                    if(j - i > 1){
                        ans.add(nums[i]+"->"+nums[j-1]);
                        i = j;
                    }
                    else{
                        ans.add(nums[j-1]+"");
                        i = j;
                    }
                   }
                }
            }
            return ans;
        }
}
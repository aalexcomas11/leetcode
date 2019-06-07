import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 2){
            return intervals;
        }
        
        int[][] ans = new int[intervals.length][2];
        
        Arrays.sort(intervals, (a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        
        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];
        int counter = 1;
        int[] prev;
        int[] curr;
        
        for(int i = 1; i < intervals.length; i++){
            prev = ans[counter - 1];
            curr = intervals[i];
            
            if(prev[1] >= curr[0]){
                ans[counter-1][0] = Math.min(prev[0],curr[0]);
                ans[counter-1][1] = Math.max(prev[1],curr[1]);
            }
            else{
                ans[counter][0] = curr[0];
                ans[counter][1] = curr[1];
                counter++;
            }
        }
        
        return Arrays.copyOf(ans,counter);
    }
}
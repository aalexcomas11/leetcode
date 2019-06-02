// not the cleanest solution but 100% faster than all java submissions
/**
 * leetcode solutions comprises on using the left most coordinates and right most
 * coordinates and using four loop to iterate in each direction and then incrementing
 * and decrementing each corner value
 */
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        int n = arr.length;
        if(n == 0)
            return (List)(new ArrayList<>());
        int m = arr[0].length;

        int max = n * m;
        int r = m - 1;
        int b = n - 1;
        int l = 0;
        int u = 1;
        char dir = 'r';
        int x = 0;
        int y = 0;
        int count = 0;
        List<Integer> ans = new ArrayList<>();

        while(count < max){
            if(dir == 'r'){
                if(x > r){
                    dir = 'b';
                    y++;
                    x--;
                    r--;
                    continue;
                }
                ans.add(arr[y][x++]);
            }
            if(dir == 'b'){
                if(y > b){
                    dir = 'l';
                    y--;
                    x--;
                    b--;
                    continue;
                }
                ans.add(arr[y++][x]);
            }
            if(dir == 'l'){
                if(x < l){
                    dir = 'u';
                    x++;
                    y--;
                    l++;
                    continue;
                }
                ans.add(arr[y][x--]);
            }
            if(dir == 'u'){
                if(y < u){
                    dir = 'r';
                    y++;
                    x++;
                    u++;
                    continue;
                }
                ans.add(arr[y--][x]);
            }
            count++;
        }
        return ans;
    }
}
/**
 * Daily Coding Problem
 * Got O(n) solution in 30 minutes with 2 passes
 * see below for N solution in one pass
 **/
import java.util.*;

class ContainsPairWithSum{
    public static void main(String[] args){

        int[] arr = {10,3,5,7};
        int val = 17;

        System.out.println(containsPairWithSum(arr,val));
    }

    public static boolean containsPairWithSum(int[] arr, int num){
        if(arr.length < 2){
            return false;
        }

        HashMap<Integer,Integer> table = new HashMap<>();

        for(int val : arr){
            if(table.containsKey(val)){
                table.put(val,table.get(val)+1); 
            }
            else{
                table.put(val,1);
            }
        }

        for(int val : arr){
            int curr = num - val;

            if(num < 1 && curr != 0){
                continue;
            }
            table.put(val,table.get(val)-1);

            if(table.containsKey(curr) && table.get(curr) > 0){
                return true;
            }

            table.put(val,table.get(val)+1);
        }

        return false;

    }
}

/**
  public static boolean containsPairWithSum(int[] a, int x) {
    Arrays.sort(a);
    for (int i = 0, j = a.length - 1; i < j;) {
        int sum = a[i] + a[j];
        if (sum < x)
            i++;
        else if (sum > x)
            j--;
        else
            return true;
    }
    return false;
   }
 */
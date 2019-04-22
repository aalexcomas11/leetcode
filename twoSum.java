import java.util.HashMap;

public class twoSum{
    public static void main(String[] args) {
        int[] arr = {2,7,15,11};
        int target = 9;
        HashMap<Integer,Integer> values = new HashMap<>();


        for(int i = 0; i < arr.length; i++){
            values.put(arr[i], i);
            int remainder = target - arr[i];

            if(remainder < 0){
                continue;
            }
            
            if(values.containsKey(remainder)){
                System.out.println("["+i+","+values.get(remainder)+"]");
                break;
            }
        }
    }
}
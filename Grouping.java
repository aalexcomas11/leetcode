import java.util.*;

class Solution {
    public int numComponents(ListNode head, int[] G) {
        
        HashSet<Integer> vals = new HashSet<>();
        
        for(int num : G){
            vals.add(num);
        }
        
        ListNode temp = head;
        int counter = 0;
        int listRow = 0;
        
        while(temp != null){
            if(!vals.contains(temp.val)){
                if(listRow > 0){
                    counter++;
                    listRow = 0;
                }
            }
            else{
                listRow++;
            }
            
            temp = temp.next;
        }
        
        if(listRow > 0){
            counter++;
        }
        
        return counter;
        
    }
}
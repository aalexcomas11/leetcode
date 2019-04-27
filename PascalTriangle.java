import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> myList = new ArrayList<>();
        int col = 1;
        
       while(col <= rowIndex+1){
            myList.add(PascalRow(rowIndex+1,col++));
       }
        
       return myList;
    }
    
    public static int PascalRow(int i, int j){
        if(j == 1 || j == i){
            return 1;
        }
        return PascalRow(i - 1, j - 1) + PascalRow(i - 1, j);
    }
    
    
}
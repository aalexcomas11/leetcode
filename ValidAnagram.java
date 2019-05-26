import java.util.*;

// solution works but assumes you can have any character

/**
 * optimal solution uses an array of 26 characters instead
 *  of a hashmap because it assumes that input only contains
 * lowercase letters
 **/ 
class Solution {
    public boolean isAnagram(String s, String t) {
        int an = 0;
        
        if(s.length() != t.length()){
            return false;
        }
        
        
        HashMap<Character,Integer> ins = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            
            char key = s.charAt(i);
            
            if(ins.containsKey(key)){
                ins.put(key,ins.get(key) + 1);
            }
            else{
                ins.put(key,1);
            }
        }
        
        int count = 0;
        
        for(int i = 0; i < t.length(); i++){
            
            if(!ins.containsKey(t.charAt(i))){
                return false;
            }
            
            int num = ins.get(t.charAt(i));
            
            if(num - 1 < 0){
                return false;
            }
            
            ins.put(t.charAt(i),  num- 1);
            count++;
        }
        
        return count == s.length();
    }
}
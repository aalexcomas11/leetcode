/**
 * Nicest implementation I found. This solution is much better than mine because it ommits
 * The hashmap and separate method that my solution has. Instead the author used a simple bucket
 * sort like approach and keep a counter in an array of 26 characters (the english alphabet) and
 * used char subtraction for the indices. Overall a nice solution to a simple problem
 */


import java.util.*;

class Solution {
    public String customSortString(String S, String T) {
        
        HashMap<String,Integer> instances = new HashMap<String,Integer>();
        
        
        for(int i = 0; i < T.length(); i++){
            if(instances.containsKey(T.charAt(i)+"")){
                instances.put(T.charAt(i)+"",instances.get(T.charAt(i)+"")+1);
            }
            else{
                instances.put(T.charAt(i)+"",1);
            }
        }
        
        String answer = "";
        
        for(int i = 0; i < S.length(); i++){
            
            if(instances.containsKey(S.charAt(i)+"")){
                answer += addLetters(S.charAt(i)+"",instances.get(S.charAt(i)+""));
                instances.remove(S.charAt(i)+"");
            }
        }
        
        for(String key : instances.keySet()){
            answer += addLetters(key,instances.get(key));
        }
        
        
        return answer;
    }
    
    public String addLetters(String key, int count){
        
        String letters = "";
        
        for(int i = 0; i < count; i++){
            letters += key;
        }
        
        return letters;
    }
}
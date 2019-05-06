/**
 * Nicest implementation I found. This solution is much better than mine because it ommits
 * The hashmap and separate method that my solution has. Instead the author used a simple bucket
 * sort like approach and keep a counter in an array of 26 characters (the english alphabet) and
 * used char subtraction for the indices. Overall a nice solution to a simple problems
 */
public String customSortString(String S, String T) {
    int[] count = new int[26];
    for (char c : T.toCharArray()) { ++count[c - 'a']; }  // count each char in T.
    StringBuilder sb = new StringBuilder();
    for (char c : S.toCharArray()) {                            
        while (count[c - 'a']-- > 0) { sb.append(c); }    // sort chars both in T and S by the order of S.
    }
    for (char c = 'a'; c <= 'z'; ++c) {
        while (count[c - 'a']-- > 0) { sb.append(c); }   // group chars in T but not in S.
    }
    return sb.toString();
}		
        
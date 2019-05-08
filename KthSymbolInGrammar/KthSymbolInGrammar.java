// bad solution look back to see proper implementation
public class KthSymbolInGrammar {
    public static void main(String[] args) {

        kthGrammar(2, 2);
        
    }
    static int kthGrammar(int N, int K) {
        if(N == 1 || K == 1){
            return 0;
        }
        
        String[] arr = new String[N+1];
        
        arr[1] = "0";
        
        for(int i = 2; i <=N; i++){
            String curr = "";
            for(int j = 0; j < arr[i-1].length(); j++){
                curr += arr[i - 1].charAt(j) == '0' ? "01" : "10";
            }
            arr[i] = curr;
        }

        System.out.println(arr[N]);

        System.out.println(arr[N].charAt(K-1));
        
        return 0;
        
        
    }
}
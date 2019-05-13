import java.util.HashSet;

public class PermutationsWithRepeated{
    public static void main(String[] args) {
        String s = "bddedaedbbbeebe";

        HashSet<Character> letters = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
           letters.add(s.charAt(i));
        }

       String san = "";

       for(char letter : letters){
        san += letter;
       }

        permHelper("",san);
    }

    static void permHelper(String a, String b) {

        if(b.length() < 2){
            System.out.println(a+b);
            return;
        }
        for(int i = 0; i < b.length();i++){
            permHelper(a+b.charAt(i), b.substring(0, i) + b.substring(i+1));
        }
    }
}
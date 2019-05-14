import java.util.ArrayList;

class ParenthesisPermutation {
    public static void main(String[] args) {
        int[] tests = {1,2,3,4,5};

        for(int num : tests){
            thePerms(num);
        }
    }

    public static void thePerms(int n){
        if(n == 0){
            System.out.println("");
            return;
        }
        if(n == 1){
            System.out.println("()");
            return;
        }

        ArrayList<StringBuilder> perms = new ArrayList<>();

        perms.add(new StringBuilder("()"));
        int longest = 0;
        int start = 0;

        for(int i = 0; i < perms.size(); i++){
            StringBuilder curr = perms.get(i);

            if(curr.length() == n * 2){
                break;
            }

            for(int j = 0; j < curr.length(); j++){
                if(j + 1 < curr.length()){
                    String theSub = curr.substring(j, j+2);
                    if(theSub.compareTo("))") == 0){
                        j++;
                        continue;
                    }
                    if(theSub.compareTo(")(") == 0){
                        continue;
                    }
                }

                StringBuilder per = new StringBuilder(curr.substring(0,j+1)).append("()").append(curr.substring(j+1));

                perms.add(per);

                if(per.length() > longest){
                    start = perms.size() - 1;
                    longest = per.length();
                }
            }
        }

        while(start < perms.size()){
            System.out.println(perms.get(start++));
        }
        System.out.println("-----------------------");
    }
}
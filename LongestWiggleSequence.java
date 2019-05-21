import java.util.*;

class LongestWiggleSequence{
    public static void main(String[] args) {

        int[]  arr = {1,7,4,9};


        thePerms(arr);

    }

    static public void thePerms(int[] n){
        if(n.length == 1){
            System.out.println(1);
            return;
        }
        ArrayList<Integer> n2 = new ArrayList<>();

        for(int num : n){
            n2.add(num);
        }
         thePermsHelper(n2);
    }
    static public void thePermsHelper(ArrayList<Integer> n){

        System.out.println(n);

        if(n.size() == 1){
            return;
        }


        for(int i = 0; i < n.size(); i++){
            ArrayList<Integer> copy = new ArrayList<>(n);
            copy.remove(i);
            thePermsHelper(copy);
        }


    }

}
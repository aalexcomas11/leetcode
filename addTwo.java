import java.util.*;

//Problem is correct but needs to be refactored to run on leetcode
public class addTwo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);

        ListIterator itr1 = l1.listIterator(0); 
        ListIterator itr2 = l2.listIterator(0);


        int val1 = 1;
        int total1 = 0;
        while(itr1.hasNext()){
            total1 += (val1 * (int)itr1.next());
            val1 *= 10;
        }

        int val2 = 1;
        int total2 = 0;
        while(itr2.hasNext()){
            total2 += (val2 * (int)itr2.next());
            val2 *= 10;
        }

        String total3 = (total1 + total2)+"";

        LinkedList<Integer> answer = new LinkedList<>();

        for(int i = total3.length() - 1; i >= 0; i--){
            answer.add(
                Integer.parseInt(total3.charAt(i)+"")
            );
        }

        System.out.println(answer);
    }
}
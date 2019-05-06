/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            ListNode temp = l2.next;
            l2.next = mergeTwoLists(null,temp);
            return l2;
        }
        if(l2 == null){
            ListNode temp = l1.next;
            l1.next = mergeTwoLists(temp,null);
            return l1;
        }
        
        ListNode tempa = l1.next;
        ListNode tempb = l2.next;
        
        if(l1.val < l2.val){
           l1.next = mergeTwoLists(tempa,l2);
           return l1;
        }
        else{
           l2.next = mergeTwoLists(l1,tempb);
           return l2;
        }
        
    }
}
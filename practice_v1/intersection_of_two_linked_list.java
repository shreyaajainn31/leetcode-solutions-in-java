/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int length(ListNode head){
        int count = 0;
        
        while(head != null){
            count++;
            head = head.next;
        }
        
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null){
            return null;
        }
        
        int length1 = length(headA);
        int length2 = length(headB);
        
        if(length1 > length2){
            int diff = length1 - length2;
            for(int i =0; i<diff; i++){
                headA = headA.next;
            }
        }
        else{
            int diff = length2 - length1;
            for(int i = 0; i<diff; i++){
                headB = headB.next;
            }
        }
        
        
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
}

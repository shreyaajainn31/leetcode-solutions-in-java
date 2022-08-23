/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        
        ListNode start = head;
        
        while(start != null){
            stack.add(start.val);
            start = start.next;
        }

        start = head;
        
        while(start != null){
           
            int s = stack.pop();
            if(start.val != s){
                return false;
            }    
            
            start = start.next;
        }
        
        return stack.isEmpty();
    }
    
    
}

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
    public int length(ListNode h){
        int count = 0;
        while(h != null){
            count++;
            h = h.next;
        }
        return count;
    }
    public int pairSum(ListNode head) {
        int l1 = length(head);
        List<Integer> list = new ArrayList<>();
        
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        
        int sum = Integer.MIN_VALUE;
        
        for(int i = 0; i<list.size(); i++){
            sum = Math.max(sum, list.get(i) + list.get(l1-i-1));
        }
        
        return sum;
    }
}

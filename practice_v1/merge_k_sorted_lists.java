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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0){
            return null;
        }
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
           
            @Override
            public int compare(ListNode l1, ListNode l2){
                return Integer.compare(l1.val, l2.val);
            }
        });
        
        for(int i= 0; i<lists.length;i++){
            if(lists[i] != null)
                pq.add(lists[i]);
        }
        
        while(!pq.isEmpty()){
            ListNode node = pq.remove();
            current.next = node;
            current = current.next;
            if(node.next != null)
                pq.add(node.next);
        }
        
        return dummy.next;
    }
}

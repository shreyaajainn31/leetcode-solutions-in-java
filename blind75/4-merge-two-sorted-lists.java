/*
https://leetcode.com/problems/merge-two-sorted-lists/
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

*/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode l1 = list1;
        ListNode l2 = list2;
        
        ListNode list = new ListNode(0);
        ListNode current = list;
        
        if(l1 == null && l2 == null){
            return null;
        }
        
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }
            else{
                current.next = l2;
                l2 = l2.next;
            }
            
            current = current.next;
        }
        
        if(l1 != null){
            current.next = l1;
        }
        if(l2 != null){
            current.next = l2;
        }
        
        return list.next;
    }
}

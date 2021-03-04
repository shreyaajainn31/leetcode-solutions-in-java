package March_Leetcode_Challenge;
/*

Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


begin to intersect at node c1.



Example 1:


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.


Example 2:


Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Reference of the node with value = 2
Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.


Example 3:


Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null
Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Each value on each linked list is in the range [1, 10^9].
Your code should preferably run in O(n) time and use only O(1) memory.

Question link: https://leetcode.com/problems/intersection-of-two-linked-lists/



 */

public class Day4 {

    public static class ListNode{

        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head = null;

    static void insert(int data){
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
        }
        else{
            ListNode curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }
    private static int findLength(ListNode head){

        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }

        return count;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null){
            return null;
        }

        int l1 = findLength(headA);
        int l2 = findLength(headB);
        int diff = 0;

        if(l1 > l2){
            diff = l1 - l2;
            for(int i = 0; i<diff; i++){
                headA = headA.next;
            }
        }
        else{
            diff = l2 - l1;
            for(int i = 0; i<diff; i++){
                headB = headB.next;
            }
        }

        ListNode curr1 = headA, curr2 = headB;

        while(curr1 != null && curr2 != null){
            if(curr1 == curr2){
                return curr1;

            }

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return null;

    }

    public static void main(String[] args) {

    }

}

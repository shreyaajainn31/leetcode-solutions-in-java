/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Follow up: Could you do this in one pass?

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 
Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

Question link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

*/
package linkedlist;

public class removeNthNodeFromEndOfLIST {

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

    static void display(){
        ListNode curr = head;
        while(curr!=null){


            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static int findLength(ListNode curr){
        int length = 0;
        while(curr!=null){
            length++;
            curr = curr.next;
        }

        return length;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int length = findLength(head);

        if(head == null || length == 1){
            return null;
        }

        if(n == length){
            head = head.next;
        }

        else{

            ListNode curr = head;
            for(int i = 0; i< length - n - 1; i++){
                curr = curr.next;
            }

            ListNode next = null;
            if(curr.next.next!=null){
                next = curr.next.next;
                curr.next = next;
            }
            else{
                curr.next = null;
            }
        }

        return head;

    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);

        System.out.println("Before removing:");
        display();

        System.out.println("After removing:");
        removeNthFromEnd(head,2);
        display();

    }


}

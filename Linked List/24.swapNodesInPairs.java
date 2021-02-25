/*

Given a linked list, swap every two adjacent nodes and return its head.
Example 1:


Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]
 

Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100

Question link: https://leetcode.com/problems/swap-nodes-in-pairs/

*/
package linkedlist;

public class swapNodesInPairs {
        private static ListNode head;
        static class ListNode{
            int data;
            ListNode next;
            ListNode(int data){
                this.data = data;
                this.next = null;
            }
        }

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
            if(head == null){
                System.out.println("list is empty.");
                return;
            }
            ListNode temp = head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode curr = head;

        int x = 0;
        while(curr.next !=null){

            x = curr.data;
            curr.data = curr.next.data;
            curr.next.data = x;

            if(curr.next.next!=null){
                curr = curr.next.next;
            }
            else{
                break;
            }

        }

        return head;
    }

    public static void main(String[] args) {

            insert(1);
            insert(2);
            insert(3);
            insert(4);

            System.out.println("Before Swapping: ");
            display();

            System.out.println("After Swapping: ");
            swapPairs(head);
            display();


        }
    }


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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = null;
        ListNode smallTail = null;
        ListNode largeHead = null;
        ListNode largeTail = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;

            if(current.val < x){
                if(smallHead == null){
                    smallHead = current;
                    smallTail = current;
                } else {
                    smallTail.next = current;
                    smallTail = current;
                }
            } else {
                if(largeHead == null){
                    largeHead = current;
                    largeTail = current;
                } else {
                    largeTail.next = current;
                    largeTail = current;
                }
            }

            current = next;
        }

        if(smallHead == null) return largeHead;

        smallTail.next = largeHead;

        if(largeTail != null){
            largeTail.next = null;
        }

        return smallHead;
    }
}
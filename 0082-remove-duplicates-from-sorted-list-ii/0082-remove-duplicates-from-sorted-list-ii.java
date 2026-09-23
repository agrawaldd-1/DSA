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
    public ListNode deleteDuplicates(ListNode head) {
        while(head != null && head.next != null && head.val == head.next.val){
            int value = head.val;

            while(head != null && head.val == value){
                head = head.next;
            }
        }

        if(head == null){
            return null;
        }

        ListNode node = head;
        ListNode current = head.next;

        while(current != null){
            if(current.next != null && current.val == current.next.val){
                int value = current.val;

                while(current != null && current.val == value){
                    current = current.next;
                }

                node.next = current;
            } else {
                node = current;
                current = current.next;
            }
        }

        return head;
    }
}
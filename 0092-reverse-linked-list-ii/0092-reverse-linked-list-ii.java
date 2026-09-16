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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }
        if (left == 1) {
            ListNode current = head;

            for (int i = 0; i < right - left; i++) {
                ListNode node = current.next;
                current.next = node.next;
                node.next = head;
                head = node;
            }

            return head;
        }
        ListNode prev = head;

        for (int i = 1; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode current = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode node = current.next;
            current.next = node.next;
            node.next = prev.next;
            prev.next = node;
        }

        return head;
    }
}
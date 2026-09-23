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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode temp = head;
        int n = 0;

        while(temp != null){
            temp = temp.next;
            n++;
        }

        k = k % n;

        if(k == 0){
            return head;
        }

        ListNode tail = head;

        for(int i = 1; i < n-k; i++){
            tail = tail.next;
        }

        ListNode newHead = tail.next;

        ListNode last = newHead;

        while(last.next != null){
            last = last.next;
        }

        last.next = head;
        tail.next = null;

        return newHead;
    }
}
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        int index = 0;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            index++;
            fast = fast.next.next;
        }
        ListNode head2 = slow;
        while(head2 != null){
            ListNode node = head2.next;
            head2.next = prev;
            prev = head2;
            head2 = node;
        }
        for(int i = 0 ; i < index ; i++){
            if(head.val != prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}
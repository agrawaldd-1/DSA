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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            n++;
        }

        int partSize = n / k;
        int remainder = n % k;

        ListNode[] result = new ListNode[k];
        ListNode current = head;

        for(int i = 0; i < k; i++){
            int size = partSize;

            if(remainder > 0){
                size++;
                remainder--;
            }

            if(size == 0){
                result[i] = null;
                continue;
            }

            ListNode partHead = current;

            for(int j = 1; j < size; j++){
                current = current.next;
            }

            ListNode next = current.next;
            current.next = null;
            result[i] = partHead;
            current = next;
        }

        return result;
    }
}
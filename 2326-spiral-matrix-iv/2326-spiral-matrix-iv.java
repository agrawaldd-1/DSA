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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode current = head;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        int[][] array = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(array[i], -1);
        }
        while(current != null && top <= bottom && left <= right){

            for(int i = left; i <= right && current != null; i++){
                array[top][i] = current.val;
                current = current.next;
            }
            top++;

            for(int i = top; i <= bottom && current != null; i++){
                array[i][right] = current.val;
                current = current.next;
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left && current != null; i--){
                    array[bottom][i] = current.val;
                    current = current.next;
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top && current != null; i--){
                    array[i][left] = current.val;
                    current = current.next;
                }
                left++;
            }
        }
        
        return array;
    }
}
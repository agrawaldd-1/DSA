/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return countLength(slow);
            }
        }
        return 0;
        
    }
    private int countLength(Node slow){
        Node temp = slow;
        int count  = 1;
        while(temp.next != slow){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
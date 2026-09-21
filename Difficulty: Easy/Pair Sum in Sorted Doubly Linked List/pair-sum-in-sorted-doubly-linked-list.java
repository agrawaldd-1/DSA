/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        if(head == null){
            return outer;
        }

        Node left = head;
        Node right = head;

        while(right.next != null){
            right = right.next;
        }

        while(left != right && left.prev != right){
            int sum = left.data + right.data;

            if(sum == target){
                ArrayList<Integer> inner = new ArrayList<>();
                inner.add(left.data);
                inner.add(right.data);
                outer.add(inner);

                left = left.next;
                right = right.prev;
            } else if(sum < target){
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return outer;
    }
}
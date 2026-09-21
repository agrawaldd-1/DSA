/*Structure of the doubly linked list  Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/

class Solution {
    public Node deleteAllOccurOfX(Node head, int x) {
        Node current = head;

        while(current != null){
            if(current.data == x){
                Node nextNode = current.next;
                Node prevNode = current.prev;

                if(current == head){
                    head = nextNode;
                }

                if(nextNode != null){
                    nextNode.prev = prevNode;
                }

                if(prevNode != null){
                    prevNode.next = nextNode;
                }

                current = nextNode;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
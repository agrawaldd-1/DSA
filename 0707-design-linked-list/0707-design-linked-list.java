class MyLinkedList {

    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {

        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void addAtTail(int val) {

        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
        } 
        else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);

        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {

            head = head.next;

            if (head == null) {
                tail = null;
            }

            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp;
        }

        size--;
    }
}
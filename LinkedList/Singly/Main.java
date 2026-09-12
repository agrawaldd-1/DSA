class LinkedList {

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void add(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void insert(int val , int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index "+index+" is out of bounds for size " + size);
        }
        if(index == 0){
            add(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;
        Node temp = head;
        while (temp.next != tail) {
        temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public int  deleteNode(int index){
        if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException(
            "Index " + index + " is out of bounds for size " + size
        );
    }
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
    
        size--;
    
        return val;
    }
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
public class Main{
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.insert(50 , 3);
        list.insert(70,4);
        list.insertLast(40);
        list.deleteFirst();
        list.deleteLast();
        list.deleteNode(2);
        list.display();
    }
    
}
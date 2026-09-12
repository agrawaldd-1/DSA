class DoublyLinkedList {

    private static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    
    public DoublyLinkedList() {
        this.size = 0;
    }
    
    public void add(int val){
        Node node = new Node(val);
        node.next = head;
        if(head!= null){
            head.prev = node;
        }
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
            node.prev = tail;
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
        Node node  = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }
    public int  deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        else{
            head.prev = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
        }
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return val;
    }    
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
    public void displayReverse() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }

        System.out.println("END");
    }
}
    

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.add(52);
		dll.add(43);
		dll.add(64);
		dll.delete(0);
		dll.insertLast(99);
		dll.display();
// 		dll.displayReverse();
		
	}
}
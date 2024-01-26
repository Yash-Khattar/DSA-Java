package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size =0;
    }
// insert node
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }

        size++;
    }

// display LL
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


// insert last
    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }

// insert at index
    public void insertIndex(int index, int val){

    Node temp = head;
     while(index!=1){
        temp = temp.next;
        index--;
     }
     
    Node node = new Node(val, temp.next);
    temp.next = node;
    
     size++; 
    }
    //inner class
    private class Node {
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }
    public Node(int value, Node next){
        this.next = next;
        this.value = value;
    }
        
    }
}

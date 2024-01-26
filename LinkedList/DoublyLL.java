package LinkedList;

public class DoublyLL {

  private  Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

public void insertLast(int val){
    Node node = new Node(val);
    node.next = null;
    if(head == null){
    node.prev = null;
    head = node;
    return;
    }
    Node temp = head;
    
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = node;
    node.prev = temp;
}

public void insertIndex(int index, int val){
   Node node = new Node(val);
   Node temp = find(index);
   node.next = temp.next;
    temp.next.prev = node;
    temp.next = node;
    node.prev = temp;
}

public Node find(int val){
    Node temp = head;
    while(temp.value != val){
        temp = temp.next;
    }
    return temp;
}

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " , ");
            node = node.next;
        }
        System.out.println();
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

    }
}

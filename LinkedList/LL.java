package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    // insert node
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // display LL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // insert last
    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }

    // insert at index
    public void insertIndex(int index, int val) {

        Node temp = head;
        while (index != 1) {
            temp = temp.next;
            index--;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert recursion
    public void insertRec(int val, int index) {
        recursion(val, index, head);
    }

    private Node recursion(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = recursion(val, index--, node.next);
        return node;
    }

    // merge
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
        LL mergedLL = new LL();
        while(f != null && s != null){
            if(f.value < s.value){
                mergedLL.insertFirst(f.value);
                f = f.next;
            }else{
                mergedLL.insertFirst(s.value);
                s = s.next;
            }
        }
        while( s!= null){
            mergedLL.insertFirst(s.value);
            s = s.next;
        }
        while( f!= null){
            mergedLL.insertFirst(f.value);
            f = f.next;
        }

        return mergedLL;

    }

    // get mid 
    public static Node mid(Node head){
    Node s = head;
Node f = head;
while(f.next != null){
    f = f.next.next;
    s = s.next;
    
}
return s;
    }

    // reverse a LL
    public static void reverse(){
        
    }


    // merge sort 
//     public static Node mergeSort(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node mid = mid(head);
//         Node left = mergeSort(head);
//         Node right = mergeSort(mid);
        
// return merge(left, right);

    // }

    // inner class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }

    }
}

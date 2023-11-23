package LinkedList;

public class SingleLinkedlist {
    public int size;
    public Node head;
    public Node tail;
    
    //create linked list with 1 node
    public Node createSingleLinkedList(int nodeValue){
        // initializing head
        head = new Node();
        //creating node
        Node node = new Node();
        node.next = null; // coz single value in list
        node.value = nodeValue;
        // refrencing h and t to node
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    //inserting in linked list
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSingleLinkedList(nodeValue);
        }
        else if(location == 0){
            node.next = head;
            head = node;
        }
        else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else{
           int index = 0;
           Node tempNode = head;
           while(index< location-1){
            tempNode = node.next;
            index++;
           }
           Node nextNode = tempNode.next;
           node.next = nextNode;
           tempNode.next = node;

        }
        size++;
    }
}

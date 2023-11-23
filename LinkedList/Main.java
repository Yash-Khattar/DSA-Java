package LinkedList;

public class Main {
      public static void main(String[] args) { 
        SingleLinkedlist sll = new SingleLinkedlist();
        sll.createSingleLinkedList(5);
        System.out.println(sll.head.value);
        sll.insertInLinkedList(6, 1);
          sll.insertInLinkedList(7, 6);
          System.out.println(sll.tail.value);
    }
}
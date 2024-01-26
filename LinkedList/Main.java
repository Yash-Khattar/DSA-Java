package LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(0);
        list.insertIndex(3, -1);

        list.display();

    }
}

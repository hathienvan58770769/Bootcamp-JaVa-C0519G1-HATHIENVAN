package thuchanh2_linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.add(2, 6);
        linkedList.add(3,7);
        linkedList.printList();
    }
}

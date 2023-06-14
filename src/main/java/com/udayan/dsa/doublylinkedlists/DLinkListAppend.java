package com.udayan.dsa.doublylinkedlists;

public class DLinkListAppend {

    public static void main(String[] args) {
        DoublyLinkedList myLinkedList = new DoublyLinkedList(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);


        myLinkedList.printList();

        DoublyLinkedList myLinkedList2 = new DoublyLinkedList(10);

        myLinkedList2.append(20);
        myLinkedList2.append(30);
        myLinkedList2.printList();

        myLinkedList2.removeLast();

        myLinkedList2.removeLast();

        myLinkedList2.printList();

        DoublyLinkedList myLinkedList3 = new DoublyLinkedList(3);

        myLinkedList3.append(2);
        myLinkedList3.append(5);
        myLinkedList3.append(4);
        myLinkedList3.append(1);
        myLinkedList3.printList();
        myLinkedList3.reverseList();
        myLinkedList3.printList();
    }

}

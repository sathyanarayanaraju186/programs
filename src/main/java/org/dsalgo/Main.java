package org.dsalgo;

import org.dsalgo.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.printList();
        linkedList.append(50);
        linkedList.printList();
    }
}
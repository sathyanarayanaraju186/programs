package org.dsalgo.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int getLength() {
        return length;
    }

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    // append is adding new node at end
    // step 1: create new node
    // step 2: check the length == 0, then point head and tail to this node
    // step 3: if length != 0, then tail.next point this new node, then that means the last node is pointing ot the address of new node
    // step 4: now point the tail to the new node, and finally increase the length.
    // time complexity O(1)
    public void append(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
        }else {
            tail.next = newnode;
            tail = newnode;
        }
        length++;
    }

    // removing the last node
    public Node removeLast(){
        if(length == 0)return null;
        if(length == 1){
            Node temp = head;
            head = null;
            tail = null;
            return temp;
        }

        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
        tail = pre;
        return temp;
    }
}
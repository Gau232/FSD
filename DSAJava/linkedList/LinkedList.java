package FSD.DSAJava.linkedList;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    private class Node {
        int data;
        Node next;
        Node () {

        }
        Node (int data) {
            this.data = data;
            this.next=null;
        }
    }

    public int size () {
        return this.size;
    }

    public void addLast (int data) {
        Node newNode = new Node(data);
        if(this.size == 0){
            this.head = new Node;
            this.tail = new Node;
            this.size = 1;
        }else{
            Node tailNode = this.tail;
            tailNode.next = newNode;
            this.tail = newNode;
            this.size += 1;
        }
    }

    public void display () {
        Node temp = this.head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getLast () throws Exception{
        Node temp = this.head;
        while(temp != null){
            temp=temp.next;
        }
        return tail.data;

    }
}
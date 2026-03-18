package org.example;

public class reverseLL {
    public class Node{
        int val;
        Node next;
        Node(){}
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public Node LinkedListReversal(Node head){
        Node prev = null;
        Node current = head;
        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}

package org.example;

public class LL {
    Node head;
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void addLast(String data){
        Node newNode2 = new Node(data);
        if(head==null){
            head=newNode2;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next = newNode2;
        newNode2.next = null;



    }
    public void display() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        System.out.print("LinkedList: ");
        while(currNode != null) {//there is a difference between node=null and node.next=null;
            System.out.print(currNode.data+" -> ");
//            if(currNode.next != null) {
//                System.out.print(" -> ");
//            }
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Abhishek is currently");
        list.addLast("Doing some work");
        list.display();

    }
}

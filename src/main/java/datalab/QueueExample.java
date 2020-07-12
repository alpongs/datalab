package datalab;

import java.util.EmptyStackException;

class Queue {
    class Node {
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node first;
    private Node last;

    public void push(int item) {
        Node newNode = new Node(item);
        if(last ==null){
            first = newNode;
        }
        else{
            Node n_last = last;
            n_last.next = newNode;
        }
        last = newNode;
    }

    public int pop() {

        if( first == null){
            throw new EmptyStackException();
        }
        Node poped = first;
        first = poped.next;

        return poped.item;
    }

    public int peek() {

        return 0;
    }
    public int size(){
        int size = 0;
        while(first!=null){
            size++;
            first = first.next;
        }
        return size;
    }
}

public class QueueExample {

}

package datalab;



import java.util.EmptyStackException;

class Queue<T> {
    class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void push(T item) {
        Node newNode = new Node<>(item);
        if(last ==null){
            first = newNode;
        }
        else{
            Node n_last = last;
            n_last.next = newNode;
        }
        last = newNode;
    }

    public T pop() {

        if( first == null){
            throw new EmptyStackException();
        }
        Node<T> poped = first;
        first = poped.next;

        return poped.item;
    }

    public T peek() {
        if(first==null){
            throw new EmptyStackException();
        }

        return first.item;
    }
    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }
    public int size() {
        int total = 0;

        Node<T> count = first;
        while (count != null) {
            total++;
            count = count.next;
        }

        return total;
    }

}

public class QueueExample {

}

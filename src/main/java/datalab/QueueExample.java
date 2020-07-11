package datalab;

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
        Node<T> newNode = new Node<>(item);
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
        return null;
    }

    public T peek() {
        return null;
    }
}

public class QueueExample {

}

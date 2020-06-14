package datalab;

class Queue<T> {
    class Node<T> {
        T item;
        Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void push(T item) {

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

package datalab;

class Stack<T> {

    class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    private Node<T> top;

    public T pop() {
        return null;
    }

    public void push(T item) {

    }

    public T peek() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }

}

public class StackExample {

}

package datalab;

import java.util.EmptyStackException;

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


    /**
     * 스택에서 꺼는 함수.
     *
     * @return : T 값을 반환.
     * @throws : EmptyStackException()
     */
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    /**
     * 스택에 넣는 값.
     * TODO :: push -> newNode
     * TODO :: newNode -> 잠재적으로 TOP
     * TODO :: newNode -> TOP -> 이전의 TOP 알아야 되요.(pop -> 다음의 노드를 알아야 되여.)
     */
    public void push(T item) {
        Node<T> newNode = new Node<>(item); //  TOP

        if (top != null) {

            newNode.next = top;
        }
        top = newNode;
    }

    /**
     * 스택의 맨 위에 저장된 객체를 반환.
     *
     * @return 저장된 객체를 반환.
     */
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    /**
     * 스택이 비어 있는지 여부 확인 함수.
     *
     * @return true / false 처리.
     */
    public boolean isEmpty() {

        return (top == null);
    }

    /**
     * 해당 Object(o) 반환 함수 못찾으면 -1 반환.
     *
     * @return object(o) // 못찾으면 -1 반환.
     */
    public int search() {
        return -1;
    }

    /**
     * 스택의 크기를 반환.
     *
     * @return Object().size() 크기 만큼 반환.
     */
    public int size() {
        int total = 0;

        Node count = top;
        while (count != null) {
            total++;
            count = count.next;
        }

        return total;
    }

}

public class StackExample {

}

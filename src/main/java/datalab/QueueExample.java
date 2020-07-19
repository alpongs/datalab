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

//public class QueueExample {
//package datalab;
//
//    /**
//     * 두개의 스택을 이용하여 Queue 구현하시오.
//     */
//    public class MyQueue {
//
//        private Stack<Integer> oldStack, newStack;
//
//        public MyQueue() {
//            oldStack = new Stack<>();
//            newStack = new Stack<>();
//        }
//
//        public int size() {
//            return (oldStack.size() + newStack.size());
//        }
//
//        public boolean isEmpty() {
//            if(oldStack.size() + newStack.size()>0){
//                return false;
//            }
//            return true;
//        }
//
//        // Stack 에 정보를 넣는다.
//        public void push(int value) {
//
//            oldStack.push(value);
//
//        }
//
//        // stack 에서 정보를 꺼낸다.
//        public Integer pop() {
//            shiftRemove();
//            return newStack.pop();
//        }
//
//        public Integer peek() {
//            return newStack.peek();
//        }
//
//        // old pop에서 new stack 으로 옮기는 함수.
//        private void shiftRemove() {
////        if(oldStack.isEmpty()){
////            System.out.println("stack is empty");
////
////        }
//            //else{
//            if(!oldStack.isEmpty()){
//                while(!oldStack.isEmpty()){
//                    newStack.push(oldStack.pop());
//                }
//            }
//        }
//    }

//}

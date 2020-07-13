package datalab;

/**
 * 두개의 스택을 이용하여 Queue 구현하시오.
 */
public class MyQueue {

    private Stack<Integer> oldStack, newStack;

    public MyQueue() {
        oldStack = new Stack<>();
        newStack = new Stack<>();
    }

    // Stack 에 정보를 넣는다.
    public void push(int value) {

    }

    // stack 에서 정보를 꺼낸다.
    public Integer pop() {
        return null;
    }

    public Integer peek() {
        return null;
    }

    // old pop에서 new stack 으로 옮기는 함수.
    private void shiftRemove() {

    }

}

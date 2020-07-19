
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

    public int size() {
        return (oldStack.size() + newStack.size());
    }

    public boolean isEmpty() {
        if (oldStack.size() + newStack.size() > 0) {
            return false;
        }
        return true;
    }

    // Stack 에 정보를 넣는다.
    public void push(int value) {

        oldStack.push(value);

    }

    // stack 에서 정보를 꺼낸다.
    public Integer pop() {
        shiftRemove();
        return newStack.pop();
    }

    public Integer peek() {
        return newStack.peek();
    }

    // old pop에서 new stack 으로 옮기는 함수.
    private void shiftRemove() {
//        if(oldStack.isEmpty()){
//            System.out.println("stack is empty");
//
//        }
        //else{
        if (!oldStack.isEmpty()) {
            while (!oldStack.isEmpty()) {
                newStack.push(oldStack.pop());
            }
        }
    }
}


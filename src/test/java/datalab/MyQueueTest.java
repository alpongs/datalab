package datalab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    @Test
    void push() {
        System.out.println("push");
        MyQueue stack = new MyQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Assertions.assertEquals(5, stack.size());
    }
    @Test
    void shiftRemove(){
        System.out.println("shiftremove");
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        Assertions.assertEquals(2,q.size());
    }
    @Test
    void pop(){
        System.out.println("pop");
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        Assertions.assertEquals(1,q.pop());
    }
    @Test
    void peek(){
        System.out.println("peek");
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.pop();
        Assertions.assertEquals(2,q.peek());
    }
}
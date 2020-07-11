package datalab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {

    Stack<Integer> stack = null;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    @AfterEach
    void tearDown() {
        stack = null;
    }

    @Test
    void pop() {
        System.out.println("pop");

        Integer pop1 = stack.pop();
        Assertions.assertEquals(4, pop1);
        Assertions.assertEquals(4, stack.size());

        Integer pop2 = stack.pop();
        Assertions.assertEquals(3, pop2);
        Assertions.assertEquals(3, stack.size());

        stack.pop();
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    void push() {
        System.out.println("push");
        // input : 5;
        // result : 5;
        Assertions.assertEquals(5, stack.size());
    }

    @Test
    void peek() {
        System.out.println("peek");
        Assertions.assertEquals(stack.peek(), 4);
    }

    @Test
    void isEmpty() {
        System.out.println("isEmpty");
//        Assertions.assertEquals(false, stack.isEmpty());
        Assertions.assertFalse(stack.isEmpty());
        for (int i = 0; i < 5; i++) {
            stack.pop();
        }
        Assertions.assertTrue(stack.isEmpty());

    }
}
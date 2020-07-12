package datalab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue q = null;
    @BeforeEach
    void setUp() {
        q = new Queue();
        for (int i = 0; i < 5; i++) {
            q.push(i);
        }
    }

    @AfterEach
    void tearDown() {
        q = null;
    }
    @Test
    void push() {
        System.out.println("push");
        Assertions.assertEquals(5,q.size());

    }

    @Test
    void pop() {
        Integer p1 = q.pop();
        Assertions.assertEquals(0,p1);
        Assertions.assertEquals(4,q.size());

        Integer p2 = q.pop();
        Assertions.assertEquals(1, p2);
        Assertions.assertEquals(3, q.size());


    }
}
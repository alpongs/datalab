package datalab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListExampleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        LinkedListExample ll = new LinkedListExample();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        // 총 5개를 넣었으니....-> 5개 이어야 문제가 없어
        Assertions.assertEquals(ll.size(), 5);
        ll.retrieve();

    }

    @Test
    void getIndex() {
    }

    @Test
    void getValue() {
    }

    @Test
    void addFirs() {
    }

    @Test
    void remove() {
    }

    @Test
    void removeFirst() {
    }

    @Test
    void size() {
    }
}
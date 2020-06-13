package datalab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListExampleTest {

    private LinkedListExample ll;
    @BeforeEach
    void setUp() {
        ll = new LinkedListExample();
        ll.add(1); // 0
        ll.add(2); // 1
        ll.add(3); // 2
        ll.add(4); // 3
        ll.add(5); // 4
    }

    @AfterEach
    void tearDown() {
        ll = null;
    }

    @Test
    void add() {
        // 총 5개를 넣었으니....-> 5개 이어야 문제가 없어
        Assertions.assertEquals(ll.size(), 5);
        ll.retrieve();
    }

    @Test
    void getIndex() {
        LinkedListExample.Node index = ll.getIndex(3);
        Assertions.assertEquals(index.getData(), 4);
    }

    @Test
    void getValue() {
        LinkedListExample.Node value = ll.getValue(2);
        Assertions.assertEquals(value.getData(), 2);
    }

    @Test
    void addFirst() {
        ll.retrieve(); // TODO:: 1 -> 2 -> 3 -> 4 -> 5
        ll.addFirst(9);
        ll.retrieve(); //TODO:: 9 -> 1 -> 2 -> 3 -> 4 -> 5
        Assertions.assertEquals(ll.size(), 6);
    }

    @Test
    void remove() {
    }

    @Test
    void removeFirst() {
    }

}
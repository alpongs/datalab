package datalab;

public class LinkedListExample {

    private Node header;
    private Node last;

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public static Node create(int data) {
            return new Node(data);
        }
    }

    // 노드를 만들때, 맨 마지막 노드의 Next 에 넣어준다.
    public void add(int data) {
        Node add = Node.create(data);
        if (getLast() == null) {
            setHeader(add);
            setLast(add);
            return;
        }

        Node last = getLast();
        last.next = add;
        setLast(add);
    }

    // 인덱스로 해당 노드의 정보를 얻고자 할때 사용한다.
    // change it to for loop
    public Node getIndex(int index) {
        int count = 0;
        if (0 > index || size() < index) {
            throw new IndexOutOfBoundsException("size less than index / index can't be less than 0");
        }

        Node first = getHeader();
        if (index == 0) {
            return first;
        }
        for(int i = 0; i< size(); i++){
            if(count == index){
                return first;
            }
            first = first.getNext();
            count++;


        }
        throw new IndexOutOfBoundsException();
    }
//    while (first != null) {
//        if (count == index) {
//            return first;
//        }
//        first = first.getNext();
//        count++;

    // 데이터중 동일한 data 값의 노드를 찾아 가져와라.

    public Node getValue(int data) {
        Node first = getHeader();
        while (first != null) {
            if (first.data == data) {
                return first;
            }
            first = first.getNext();
        }
        return null;
    }


    // Header 결
    public void addFirst(int data) {
        Node addFirst = Node.create(data);
        addFirst.next = header;
        header = addFirst;
    }

    public void remove() {
        // delete the last node
        Node header =getHeader();
        Node rear = getLast();
        while (header.next != rear){ // see if next is last
            header = header.next;
        }
        header.next = null; // reached here = meaning next one is the last node

    }

    public void removeFirst() {
        // remove the first node
        Node header = getHeader();
        if(size()<=0){
            throw new IndexOutOfBoundsException("there is nothing to delete");
        }
        setHeader(header.next);

    }

    public int size() {
        // 노드의 개수를 반환하시오.
        if (header == null) return 0;
        int result = 0;
        Node first = getHeader();
        while (first != null) {

            result++;
            first = first.getNext();
        }
        return result;
    }

    public void retrieve() {
        Node node = getHeader();
        while (node.next != null) {
            System.out.print(node.data + " -> ");
            node = node.getNext();
        }
        System.out.println(node.data);
    }
}

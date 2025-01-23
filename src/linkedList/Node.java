package linkedList;

public class Node {
    private Node next;
    private int value;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node() {
        this.value = 0;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

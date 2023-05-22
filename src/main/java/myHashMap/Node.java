package myHashMap;

public class Node {
    protected Object key;
    protected Object value;
    protected Node next;

    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
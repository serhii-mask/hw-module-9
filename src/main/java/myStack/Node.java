package myStack;

public class Node<T> {
    private T value;
    private myLinkedList.Node<T> next;
    private myLinkedList.Node<T> prev;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public myLinkedList.Node<T> getNext() {
        return next;
    }

    public void setNext(myLinkedList.Node<T> next) {
        this.next = next;
    }

    public myLinkedList.Node<T> getPrev() {
        return prev;
    }

    public void setPrev(myLinkedList.Node<T> prev) {
        this.prev = prev;
    }
}
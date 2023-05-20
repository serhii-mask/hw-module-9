package myQueue;

import myLinkedList.Node;

public class MyQueue<T> {
    private myLinkedList.Node<T> first;
    private myLinkedList.Node<T> last;
    private static int size = 0;

    public void add(T item) {
        myLinkedList.Node<T> newNode = new myLinkedList.Node<>();
        newNode.setValue(item);

        if(first == null) {
            first = newNode;
            last = newNode;
            newNode.setNext(null);
            newNode.setPrev(null);
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }

        size++;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (first == null) {
            return null;
        }

        return first.getValue();
    }

    public T poll() {
        if (first == null) {
            return null;
        }

        Node<T> firstElementRemove = first;

        first = firstElementRemove.getNext();

        size--;

        return firstElementRemove.getValue();
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
}


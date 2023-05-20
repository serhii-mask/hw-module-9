package myStack;

import myLinkedList.Node;

public class MyStack<T> {
    private myLinkedList.Node<T> first;
    private myLinkedList.Node<T> last;
    private static int size = 0;

    public void push(T item) {
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
            throw new IndexOutOfBoundsException("List is empty");
        }

        return first.getValue();
    }

    public T pop() {
        if (first == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        Node<T> firstElementRemove = first;

        first = firstElementRemove.getNext();

        size--;

        return firstElementRemove.getValue();
    }

    public T remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
        }

        Node<T> search = first;
        if (index == 0) {
            first = search.getNext();
        } else if (index == size - 1) {
            last = search.getPrev();
        } else {
            for (int i = 0; i < index; i++) {
                search = search.getNext();
            }

            search.getNext().setPrev(search.getPrev());
            search.getPrev().setNext(search.getNext());
        }

        size--;

        return search.getValue();
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
}

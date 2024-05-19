package linkedlist;
import java.util.Iterator;


public class LinkedList<T> implements Iterable<T>{
    private Node<T> head;
    private int size;
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    public void addFirst(T item) {
        head = new Node<>(item, head);
        size++;
    }
    public void addLast(T item) {
        if(head == null) {
            addFirst(item);
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<>(item, null);
            size++;
        }
    }
    public int size() {
        return size;
    }
    public T get(int position) {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException();
        }
        return temp.data;
    }
    public boolean isEmpty() {
        return head == null;
    }
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}

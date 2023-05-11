package homework_4;

import java.util.LinkedList;

public class MyEnqueue<T> {
    public MyEnqueue() {
        list = new LinkedList<T>();
    }

    private LinkedList<T> list;

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {

        return list.pollFirst();
    }

    public T first() {
        return list.peekFirst();
    }

    public String toString() {
        return list.toString();
    }
}

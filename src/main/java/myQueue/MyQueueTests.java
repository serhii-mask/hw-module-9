package myQueue;

public class MyQueueTests {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());

        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("Fourth");
        queue.add("Fifth");
        System.out.println("queue.size() = " + queue.size());

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.size() = " + queue.size());

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.size() = " + queue.size());

        queue.clear();
        System.out.println("queue.size() = " + queue.size());
    }
}

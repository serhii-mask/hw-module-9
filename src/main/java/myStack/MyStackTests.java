package myStack;

public class MyStackTests {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        //System.out.println("stack.pop() = " + stack.pop());
        //System.out.println("stack.peek() = " + stack.peek());

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        System.out.println("stack.size() = " + stack.size());

        stack.remove(1);
        System.out.println("stack.size() = " + stack.size());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.size() = " + stack.size());

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.size() = " + stack.size());

        stack.clear();
        System.out.println("stack.size() = " + stack.size());
    }
}

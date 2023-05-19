package myLinkedList;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));

        System.out.println("list.size() = " + list.size());

        list.remove(1);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.size() = " + list.size());

        list.clear();
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
    }
}

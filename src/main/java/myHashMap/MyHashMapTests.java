package myHashMap;

public class MyHashMapTests {
    public static void main(String[] args) {
        MyHashMap persons = new MyHashMap();

        persons.put("Martin", 43);
        persons.put("Firson", 23);
        persons.put("Avgustina", 31);
        persons.put("Kuba", 47);
        persons.put("Elizabet", 26);
        System.out.println("map.get() = " + persons.get("Firson"));
        System.out.println("map.get() = " + persons.get("Elizabet"));

        System.out.println("map.size() = " + persons.size());

        persons.remove("Avgustina");
        System.out.println("map.size() = " + persons.size());

        persons.clear();
        System.out.println("map.size() = " + persons.size());

        System.out.println("map.get() = " + persons.get("Kuba"));
    }
}

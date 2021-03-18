import java.util.*;

public class Main {
    public static void main0 (String[] args) {
        List collection = new ArrayList();
        collection.add("51");
        collection.add("42");
        collection.add("1");
        collection.add("80");
        collection.add("80");
        collection.set(2, "999");
        //System.out.println(collection.get(1));
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void main2(String[] args) {
        Set collection2 = new HashSet();
        collection2.add("102");
        collection2.add("142");
        collection2.add("50");
        collection2.add("181");
        collection2.add("181");
        for (Object o : collection2)
            System.out.println(o);

    }

    public static void main3 (String[] args) {
        Queue collection3 = new PriorityQueue();
        collection3.offer("783");
        collection3.offer("255");
        collection3.offer("199");
        collection3.offer("460");
        collection3.offer("783");
        Iterator iterator = collection3.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            System.out.println(collection3.poll());
        }
System.out.println("Элементы"+ collection3.size());
    }
    public static void main (String[] args) {
        Map collection4 = new HashMap();
        collection4.put("102", "Stels");
        collection4.put("142", "Marin");
        collection4.put("50", "Norco");
        collection4.put("181", "Stern");
        collection4.put("185", "Cube");
            System.out.println(collection4.get("50"));
    }
}


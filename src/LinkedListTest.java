import java.util.Collection;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.offer("xzwb");
        list.push("yyf");
        System.out.println(list);
        System.out.println(list.get(0));
        for (Object str : list) {
            System.out.println((String) str);
        }
    }
}

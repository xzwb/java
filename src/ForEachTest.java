import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add("15");
        collection.add("world");
        collection.add("17");
        for (Object obj : collection) {
            String str = (String)obj;
            System.out.println(str);
            if (str.equals("15")) {
                collection.remove(str);
            }
        }
        Iterator iterator = collection.iterator();
        iterator.next();
        System.out.println(collection);
    }
}

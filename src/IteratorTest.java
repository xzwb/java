import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("15");
        collection.add("25");
        Iterator iterator = collection.iterator();
        iterator.forEachRemaining(obj->System.out.println(obj));
        while (iterator.hasNext()) {
            System.out.println("执行了");
            String str = (String)iterator.next();
            System.out.println(str);
            if (str.equals("25")) {
                iterator.remove();
                collection.remove(str);
                collection.remove("10");
            }
        }
        System.out.println(collection);
        iterator.forEachRemaining(obj->System.out.println(obj));
    }
}

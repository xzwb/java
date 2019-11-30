import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] objects = new Object[100];
        Collection<Object> co = new ArrayList<>();
        fromArrayToCollection(objects, co);
        String[] strings = new String[100];
        Collection<String> cs = new ArrayList<>();
        fromArrayToCollection(strings, cs);
        fromArrayToCollection(strings, co);
    }
}

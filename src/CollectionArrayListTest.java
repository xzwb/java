import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionArrayListTest {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add("孙悟空");
        collection.add(15);
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.remove(6));
        System.out.println(collection.size());
        System.out.println("集合里是否包含15" + collection.contains(15));
        */
        Collection collection = new HashSet();
        collection.add("xzwb");
        collection.add("yyf");
        collection.add(15);
        /*collection.add("yyf");*/
        System.out.println(collection);
       /* Collection collection1 = new ArrayList();
        collection1.add(15);
        collection1.add("sssssss");
        collection.removeAll(collection1);
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        collection1.retainAll(collection);
        System.out.println(collection1);*/
        // 使用froEach方法
        collection.forEach(obj->System.out.println(obj));
    }
}

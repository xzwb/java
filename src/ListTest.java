import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new String("xzwb"));
        list.add(new String("xzwb1"));
        list.add(new String("xzwb2"));
        System.out.println(list);
        list.add(1, "yyf");
        System.out.println(list);
        List list1 = new ArrayList();
        list1.add("sssssss");
        list1.add("kkkkkkkkkkkkkk");
        /*list.addAll(list1);*/
        list.addAll(0, list1);
        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.indexOf("asfa"));
        list.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
        System.out.println(list);
        /*list.replaceAll(ele->((String)ele).length());
        System.out.println(list);*/
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            listIterator.add("-------------------");
        }
        // 反向
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

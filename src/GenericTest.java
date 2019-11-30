import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("xzwb");
        stringList.add("yyf");
        System.out.println(stringList);
        /*stringList.add(5);*/
        stringList.forEach(str -> System.out.println(str.length()));
    }
}

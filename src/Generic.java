import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("xzwb");
        names.add("yyf");
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("haohaoxuexi");
        map.put("xx", names);
        map.put("ff", list);
        map.forEach((key, value) -> System.out.println(key + "--->" + value));
    }
}

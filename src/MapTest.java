import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("xzwb", 180);
        map.put("yyf", 180);
        map.put("cyw", 160);
        // 当插入相同的key时会替换value并返回被替换的value
        map.put("xzwb", 190);
        System.out.println(map.put("xzwb", 200));
        System.out.println("是否包含xzwb ? "+ map.containsKey("xzwb"));
        System.out.println("是否有value\"180\" ? " + map.containsValue(180));
        for (Object key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
        map.remove("xzwb");
        System.out.println(map);
    }
}

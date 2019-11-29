import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new R(3), "xzwb");
        treeMap.put(new R(-1), "yyf");
        treeMap.put(new R(10), "xx");
        treeMap.put(new R(5), "yy");
        System.out.println(treeMap);
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.higherKey(new R(2)));
        System.out.println(treeMap.lowerEntry(new R(2)));
        System.out.println(treeMap.subMap(new R(-1), new R(4)));
    }
}

class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            return ((R)obj).count == this.count ;
        }
        return false;
    }

    public int compareTo(Object obj) {
        R r = (R)obj;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}



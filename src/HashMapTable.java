import java.util.Hashtable;

class E {
    int count;
    public E(int count) {
        this.count = count;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == E.class) {
            E a = (E) obj;
            return this.count == a.count;
        }
        return false;
    }

    public int hashCode() {
        return this.count;
    }
}

class D {
    public boolean equals(Object obj) {
        return true;
    }
}

public class HashMapTable {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(new E(6000), "xzwb");
        hashtable.put(new E(5000), "yyf");
        hashtable.put(new E(185), new D());
        System.out.println(hashtable);
        // 因为D类的equals方法和任何类比较都返回true所以下面的方法总成立
        System.out.println(hashtable.containsValue("asdfadfa"));
        System.out.println(hashtable.remove(new E(6000)));
    }
}



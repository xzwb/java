import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(10);
        arr.add("hello");
        arr.add("world");
        arr.add("we");
        arr.add("are");
        arr.add("Linuxer");
        ArrayList arr1 = new ArrayList(10);
        arr1.add("hello");
        arr1.add("world");
        arr1.add("we");
        arr1.add("are");
        arr1.add("Linuxer");
        System.out.println(arr.equals(arr1));
        System.out.println(arr);
    }
}

public class ArrayList {
    private Object[] list;
    
    private int next;
    
    public ArrayList() {
        this(16);
    }

    public ArrayList(int n) {
        list = new Object[n];
        next = 0;
    }

    public void add(Object obj) {
        if (next == list.length) {
            list = Arrays.copyOf(list, list.length*2);
        }
        list[next++] = obj;
    }

    public Object get(int index) {
        return list[index];
    }

    public int size() {
        return next;
    }

/*  public String toString() {
        String str = "";
        for (int i = 0; i < next; i++) {
            str = str + get(i) + " ";
        }

        return str;
    } */
   
    public String toString() {
        String str = "";
        for (int i = 0; i < next; i++) {
            str = str.concat((String)get(i));
            str = str.concat(" ");
        }

        return str;
    }

    public boolean equals(ArrayList arr) {
        if (this.size() != arr.size()) {
            return false; 
        }
        for (int i = 0; i < arr.list.length; i++) {
                
        
        }

        return true;
    }
}

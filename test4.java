import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Fish fish1 = new Fish("小a");
        Fish fish2 = new Fish("小h");
        Fish fish3 = new Fish("小b");
        arr.add(fish1);
        arr.add(fish2);
        arr.add(fish3); 
        ArrayList arr1 = new ArrayList();
        /* String a = "123";
        String b = "4560";
        arr1.add(a);
        arr1.add(b); */
        String c = new String("789");
        String d = new String("756");
        arr1.add(c);
        arr1.add(d);
    }
}

public class Fish {
    private String color;
    
    public Fish(String color) {
        this.color = color;
    }
}

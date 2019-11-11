/* public class Main {
    public static void main(String[] args) {
        Some s = new SomeImpl();
        s.doSome();
    }
}

public interface Some {
    protected void doSome();
}

class SomeImpl implements Some {
    public void doSome() {
        System.out.println("1234456");
    }
} */

public class Main {
    public static void main(String[] args) {
        Some s = new SomeImpl();
        s.doSome();
    }
}

public interface Some {
    public void doSome();
}

class SomeImpl implements Some {
    protected void doSome() {
        System.out.println("54555");
    }
}

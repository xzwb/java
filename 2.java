public class CallByValue {
    public static void main(String[] args) {
        Customer c1 = new Customer("xzwb");
        some(c1);
        System.out.println(c1.name);

        Customer c2 = new Customer("yyf");
        other(c2);
        System.out.println(c2.name);
    }

    public static void some(Customer c) {
        c.name = "1";
    }

    public static void other(Customer c) {
        c = new Customer("2");
    }
}

public class Customer {
    public String name;
    
    Customer(String name) {
        this.name = name;
    }
}

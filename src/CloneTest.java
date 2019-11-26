public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(15);
        User u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
    }
}

class Address {
    String detail;
    public Address(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("西安邮电大学");
    }

    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
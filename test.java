public class PrivateTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(45);
        person.setName("张飞");
        person.talk();
    }
}

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("我的名字是" + name + "我的年龄是" + age);
    }
}

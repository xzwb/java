public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.printf();
        Demo demo1 = new Demo("刘备");
        demo1.printf();
        Demo demo2 = new Demo("刘备", 25);
        demo2.printf();
    }
}


public class Demo {
    public Demo() {
        System.out.println("hello world!!");
    }    
    
    // 构造代码块
    {
        System.out.println("start!!");    
    }
    
    public Demo(String name) {
        this.name = name;
    }

    public Demo(String name, int age) {
        // 多参调用
        this(name);
        // this.name = name;
        this.age = age;
    }
    
    public void printf() {
        System.out.println("name = " + name + ", age = " + age + ", country = " + country);
    }

    private String name;
    private int age;
    static private String country = "cn";

}

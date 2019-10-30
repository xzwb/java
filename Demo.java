public class Main {
    public static void main(String[] args) {
        System.out.println("开始!!");
        Demo demo = new Demo();
        demo.printf();
        Demo demo1 = new Demo("刘备");
        demo1.printf();
        Demo demo2 = new Demo("刘备", 25);
        demo2.printf();
        int a = Demo.add(1, 2);
        System.out.println("a = " + a);

    }
}


public class Demo {
    public Demo() {
        System.out.println("hello world!!");
    }    
    
    // 静态方法
    public static int add(int a, int b) {
        return a + b;
    }

    // 静态代码块在一个类第一次被加载时执行
    static {
        System.out.println("静态代码块");
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

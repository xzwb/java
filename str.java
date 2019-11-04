public class Str {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder("打印结果:");
        sBuilder.append("我是一个容器");
        System.out.println(sBuilder);
        sBuilder.append(new Object());
        System.out.println(sBuilder);

    }
}

public class StringTest {
    public static void main(String[] args) {
        String s = "hello world";
        String s1 = new String("hello world");
        StringBuffer s2 = new StringBuffer("HelloWorld");
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
        System.out.println("s = " + s.hashCode());
        System.out.println("s1 = " + s1.hashCode());
        System.out.println(s.charAt(0));
        // 并不会改变原有字符串
        s.concat(s1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.concat(s1));
        char[] str = {'a', 'b', 'c'};
        s = String.copyValueOf(str);
        System.out.println(s);
        byte[] a;
        a = s.getBytes();
        System.out.println(a);
    }
}

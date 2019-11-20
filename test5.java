import java.lang.System;


public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        judge(10);
        long endTime = System.nanoTime();
        System.out.println("程序运行时间" + (endTime - startTime) + "ns");
        startTime = System.nanoTime();
        judge2(10);
        endTime = System.nanoTime();
        System.out.println("程序运行时间" + (endTime - startTime) + "ns");
    }

    public static boolean judge(int i) {
        return i%2 != 0; 
    }

    public static boolean judge2(int i) {
        return (i&1) == 1;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main fb = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fb.fibonacci(i) + " ");
        }
        System.out.println();
    }
    
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }                                                                                    
}

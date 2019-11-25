import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        // 用于设置分隔符
        /*sc.useDelimiter(" ");*/
        while (sc.hasNext()) {
            System.out.println("键盘输入的内容是：" + sc.next());
        }
    }
}

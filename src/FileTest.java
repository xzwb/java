import java.io.File;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("/home/xzwb/1.txt"));
        System.out.println("文件内容如下");
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}

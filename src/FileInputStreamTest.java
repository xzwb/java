import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args)
        throws IOException {
        FileInputStream fis = new FileInputStream("./src/FileInputStreamTest.java");
        byte[] bytes = new byte[1024];
        int hasRead = 0;
        while ((hasRead = fis.read(bytes)) > 0) {
            System.out.println(new String(bytes, 0, hasRead));
        }
        fis.close();
    }
}

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args)
        throws IOException {
        FileReader fd = new FileReader("./src/FileReaderTest.java");
        char[] buff = new char[32];
        int hasRead = 0;
        while ((hasRead = fd.read(buff)) > 0) {
            System.out.println(buff);
        }
        fd.close();
    }
}

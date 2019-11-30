import java.io.FileOutputStream;

public class ThrowTest {
    public static void main(String[] args)
        throws Exception {
        try {
            new FileOutputStream("a");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.setProperty("username", "xzwb");
        props.setProperty("password", "520520cw...");
        props.store(new FileOutputStream("/home/xzwb/a.ini"), "comment line");
        System.out.println(props);
        props.setProperty("email", "1478863479@qq.com");
        Properties props1 = new Properties();
        // 从文件中取出键值对
        props1.load(new FileInputStream("/home/xzwb/a.ini"));
        System.out.println(props1);
    }
}

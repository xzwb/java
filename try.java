import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("./1.txt");
            char temp = (char)reader.read();
            System.out.println(temp);
        } catch(FileNotFoundException sss) {
            System.out.println("文件没有找到");
            sss.printStackTrace();
        } catch(IOException sss) {
            System.out.println("读取错误");
            sss.printStackTrace();
        } finally {
            System.out.println("不管有没有错误,我一定被执行");
            try {
                reader.close();
            } catch(IOException sss) {
                sss.printStackTrace();
            }
        }
    }
}

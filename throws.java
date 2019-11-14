import java.io.*;

public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            str = new Main().openFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }

    String openFile() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("./1.txt");
        char c = (char)reader.read();
        return "sss";
    }
}

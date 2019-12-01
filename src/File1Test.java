import java.io.IOException;

public class File1Test {
    public static void main(String[] args)
            throws IOException {
        java.io.File file = new java.io.File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile().getParent());
        java.io.File temFile = java.io.File.createTempFile("aaa", ".txt", file);
        temFile.deleteOnExit();
        java.io.File newFile = new java.io.File(System.currentTimeMillis() + "");
        System.out.println("newFile对象是否存在  " + newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();
        String[] fileList = file.list();
        System.out.println("====当前路径下所有文件和路径====");
        for (String fileName : fileList) {
            System.out.println(fileName);
        }
        java.io.File[] roots = java.io.File.listRoots();
        System.out.println("===系统所有根路径===");
        for (java.io.File root : roots) {
            System.out.println(root);
        }
    }
}

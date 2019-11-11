public class Main {
    public static void main(String[] args) {
        System.out.println(Some.x);       
    }
}

interface Some {
    int x = 10;
    // 默认为public static final
}




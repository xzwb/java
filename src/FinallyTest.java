public class FinallyTest {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(min(5));
    }

    static int max(int a, int b) {
        try {
            return a;
        }
        // finally中return会直接return
        finally {
            return b;
        }
    }

    static int min(int a) {
        try {
            return a;
        }
        // finally中改变返回值正常语句中不会受到影响
        finally {
            a += 2;
        }
    }
}

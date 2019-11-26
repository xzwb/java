import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        /*Random rand = new Random();
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextBoolean());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));*/

        Random rand1 = new Random(50);
        /*System.out.println(rand1.nextInt());*/
        System.out.println(rand1.nextBoolean());
        System.out.println(rand1.nextInt());
        System.out.println(rand1.nextDouble());
        Random rand2 = new Random(50);
        System.out.println(rand2.nextInt());
        System.out.println(rand2.nextBoolean());
        System.out.println(rand2.nextDouble());
        Random rand3 = new Random(System.currentTimeMillis());
        System.out.println(rand3.nextInt());
    }
}

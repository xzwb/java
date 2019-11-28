import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(-2);
        arrayDeque.offer(10);
        arrayDeque.offer(5);
        System.out.println(arrayDeque);
        arrayDeque.add(12);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
    }
}

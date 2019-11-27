import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        IntStream intStream = IntStream.builder()
                .add(10)
                .add(20)
                .add(-10)
                .add(18)
                .build();
        System.out.println("intStream元素的最大值" + intStream.max().getAsInt());
        /*System.out.println("intStream元素的最小值" + intStream.min().getAsInt());
        System.out.println("intStream元素的和" + intStream.sum());
        System.out.println("intStream元素的总数" + intStream.count());
        System.out.println("intStream元素的平均" + intStream.average());
        System.out.println("intStream所有元素平方大于20" + intStream.allMatch(ele -> ele * ele > 20));
        IntStream newIs = intStream.map(ele -> ele * 2 + 1);
        newIs.forEach((System.out::println));*/
    }
}

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(100000000000L);
        System.out.println(date1);
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        /*String str = "hello , world";
        String str = "helloworld";
        // 贪婪模式
        System.out.println(str.replaceFirst("\\w*", "^^"));
        // 勉强模式
        System.out.println(str.replaceFirst("\\w*?", "^^"));
        */

        /*Pattern pattern = Pattern.compile("a.*b");
        Matcher matcher = pattern.matcher("aaccaaaab");
        System.out.println(matcher.matches());
        */

        String[] mails = {
                "1478863479@qq.com",
                "xzwb@xiyoulinux.org",
                "yyf@abc.xx"
        };
        String mailRegex = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        Pattern mailPattern = Pattern.compile(mailRegex);
        Matcher matcher = null;
        for (String mail : mails) {
            if (matcher == null) {
                matcher = mailPattern.matcher(mail);
            } else {
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? "yes" : "no") + "一个有效的地址";
            System.out.println(result);
        }
    }
}

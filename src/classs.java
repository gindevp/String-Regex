import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classs {
    public static void main(String[] args) {
        try{
            String c1 = "C0318G";
            String c2 = "C0318G";
            String c3 = "C0323K";

            String regex = "^[CAP]\\d{4}[G-K]$";

            Pattern pattern = Pattern.compile(regex);
            Matcher m1 = pattern.matcher(c1);
            Matcher m2 = pattern.matcher(c2);
            Matcher m3 = pattern.matcher(c3);

            boolean matcher1 = m1.matches();
            boolean matcher2 = m2.matches();
            boolean matcher3 = m3.matches();

            System.out.println("Match = " + matcher1);
            System.out.println("Match = " + matcher2);
            System.out.println("Match = " + matcher3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

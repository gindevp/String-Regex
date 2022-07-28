import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    public AccountExample(){

    }
    public boolean validate(String regex){
        Pattern pattern= Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String x: validAccount
             ) {
            boolean isvalid= accountExample.validate(x);
            System.out.println("Account is " + x +" is valid: "+ isvalid);
        }
        for (String x: invalidAccount
             ) {
            boolean isvalid= accountExample.validate(x);
            System.out.println("Account is " + x +" is valid: "+ isvalid);
        }
    }
}

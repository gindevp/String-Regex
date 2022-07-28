import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX= "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public  ValidateEmail(){
        pattern= Pattern.compile(EMAIL_REGEX);
    }
    public  boolean validate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }

    private static ValidateEmail validateEmail;
    public  static final String[] validEmail= new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String[] args) {
validateEmail= new ValidateEmail();
        for (String x: validEmail
             ) {
            boolean isvalid= validateEmail.validate(x);
            System.out.println("Email is " + x +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}

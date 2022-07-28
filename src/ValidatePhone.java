import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static void main(String[] args) {
        try{
            Scanner input= new Scanner(System.in);
            while (true){
                System.out.println("Input:");
                String str= input.nextLine();
                String regex= "(\\+?[\\d]{1,3}([-]{0,2}|[\\s]+)?)?\\(?(\\d{3})\\)?([-]{0,2}|[\\s])?(\\d{3})([-]{0,2}|[\\s])?(\\d{4})";
                Pattern pattern= Pattern.compile(regex);

                if(pattern.matcher(str).matches()){
                    System.out.println("ok");
                }else {
                    System.out.println(".");
                }
            }
        }catch (Exception e){
                throw new RuntimeException(e);
        }
    }
}

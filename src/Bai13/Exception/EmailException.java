package Bai13.Exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailException extends Exception{
    public EmailException(String str){
        super(str);
    }
//    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
//            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
//    static void EmailException(String email) throws EmailException{
//        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
//        if(!matcher.find()) throw new EmailException("Email is not valid!");
//    }
}

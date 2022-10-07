package Bai14.Validation;

public class FieldValidate {
    public static boolean isFullname(String str) {
        String expression = "^[a-zA-Z\\s]{10,50}";
        return str.matches(expression);
    }
    public static boolean isBirthday(String str) {
        String expression = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
        return str.matches(expression);
    }
    public static boolean isPhoneNumber(String str) {
//        String expression = "^([0-9]{7}$', 'i')";
        String expression = "^((090)|(098)|(091)|(031)|(035)|(038))[0-9]{7}$";
        return str.matches(expression);
    }
    public static boolean isSex(String str) {
        if(!str.equals("man") & !str.equals("woman") & !str.equals("other")) return false;
        return true;
    }
    public static boolean isGPA(String str) {
            Double gpa = Double.valueOf(str);
            if (gpa <= 0 ||gpa > 4) return false;
            return true;
    }

    public static boolean isEntryTestScore(String str) {
        Integer entryTestScore = Integer.valueOf(str);
        if (entryTestScore <= 0 ||entryTestScore > 100) return false;
        return true;
    }

    public static boolean isEnglishScore(String str) {
        Integer englishScore = Integer.valueOf(str);
        if (englishScore <= 0 ||englishScore > 990 || englishScore % 5 != 0) return false;
        return true;
    }
    public static boolean isValidInputAmount(Integer amount) {
        if (amount < 11 || amount > 15) return false;
        return true;
    }
}

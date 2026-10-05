import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-(0\\d{9})$";

    public static boolean isValidPhoneNumber(String phone) {
        if (phone == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();

    }

    public static void main(String[] args) {

        String[] testCases = {
                "(84)-(0978489648)",
                "(a8)-(222222222)",
                "(84)-(22b222222)",
                "(84)-(9977454554)",
                "(84)-(02113456458)"
        };
        System.out.println("ket qua kiem tra");
        for (String phone : testCases) {
            boolean isValid = isValidPhoneNumber(phone);
            System.out.printf("So: %-20s-> %s/n", phone, (isValid ? "hop le" : "khong hop le"));
        }

    }
}
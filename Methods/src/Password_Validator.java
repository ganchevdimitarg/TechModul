import java.util.Scanner;

public class Password_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passWord = scanner.nextLine();

        if (validatePassWord(passWord)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean validatePassWord(String str) {

        boolean correctCharterCount = validateCouter(str);
        boolean onlyLettertsAndDigit = validateContain(str);
        boolean leastTwoDigis = validateDigit(str);

        return correctCharterCount && onlyLettertsAndDigit && leastTwoDigis;
    }

    private static boolean validateDigit(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                count++;
                if (count >= 2){
                    return true;
                }
            }
        }
        System.out.println("Password must have at least 2 digits");
        return false;

    }

    private static boolean validateContain(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    private static boolean validateCouter(String str) {
        boolean isValid = str.length() > 5 && str.length() < 11;

        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
}



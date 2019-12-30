import java.util.Scanner;

public class Valid_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String name : userNames) {
            if (name.length() >= 3 && name.length() <= 16){
                String correctName = name.replaceAll("[a-zA-z 0-9 _ \\-]+","");
                if (correctName.isEmpty()){
                    System.out.println(name);
                }
            }
        }
    }
}

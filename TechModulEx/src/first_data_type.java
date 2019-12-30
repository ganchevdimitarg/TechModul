import java.util.Scanner;

public class first_data_type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i)-'0';
            sum += num;
        }
        System.out.println(sum);
    }
}


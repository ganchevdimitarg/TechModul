import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class House_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cmdSet = Integer.parseInt(scanner.nextLine());
        int couter = 0;
        List<String> names = new ArrayList<>();

        while (couter < cmdSet){
            String[] cmd = scanner.nextLine().split(" ");

            if (!cmd[2].equals("not")){
                if (!names.contains(cmd[0])) {
                    names.add(cmd[0]);
                } else {
                    System.out.println(cmd[0] + " is already in the list!");
                }
            } else {
                if (names.contains(cmd[0])) {
                    names.remove(String.valueOf(cmd[0]));
                } else {
                    System.out.println(cmd[0] + " is not in the list!");
                }
            }
            couter++;
        }
        names.forEach(System.out::println);
    }
}

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UnitThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        List<String> cmd = Arrays.stream(scanner.nextLine().split("- ")).collect(Collectors.toList());

        while (!cmd.contains("Retire!")) {

            if (cmd.contains("Start ")) {
                if (!journal.contains(cmd.get(1))) {
                    journal.add(cmd.get(1));
                }
            }
            if (cmd.contains("Complete ")) {

                if (journal.contains()) {
                    journal.remove("For loop");
                }

//            } else if (cmd.contains("Side ")) {
//                if (journal.contains(cmd.get(1))) {
//                    journal.add(cmd.get(3) + cmd.get(4));
//                }
//            } else if (cmd.contains("Renew ")) {
//                if (journal.contains(cmd.get(1))) {
//                    journal.add(cmd.get(1));
//
//                    journal.remove(cmd.get(1));
//                }
            }


            cmd = Arrays.stream(scanner.nextLine().split("-")).collect(Collectors.toList());

        }
        for (int i = 0; i < journal.size(); i++) {
            if (i == journal.size()-1){
                System.out.print(journal.get(i));
            } else {
                System.out.print(journal.get(i) + ", ");
            }
        }
    }
}

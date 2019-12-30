import java.util.Scanner;

public class Lady_Bugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        String[] indexes = scanner.nextLine().split(" ");

        int[] field = new int[fieldSize];

        for (int i = 0; i < indexes.length; i++) {
            int index = Integer.parseInt(indexes[i]);
            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] cdmArgs = command.split(" ");

            int index = Integer.parseInt(cdmArgs[0]);
            String cmd = cdmArgs[1];
            int flyLeght = Integer.parseInt(cdmArgs[2]);

            if (index < 0 || index > fieldSize - 1 || field[index] == 0) {
                command = scanner.nextLine();
                continue;
            }

            field[index] = 0;
            if (cmd.equals("right")) {
                index += flyLeght;
                while (index < fieldSize && field[index] == 1) {
                    index += flyLeght;
                }
                if (index < fieldSize) {
                    field[index] = 1;
                }
            } else {
                index -= flyLeght;
                while (index >= 0 && field[index] == 1){
                    index -=flyLeght;
                }
                if (index >= 0) {
                    field[index] = 1;
                }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
        System.out.println();
    }
}

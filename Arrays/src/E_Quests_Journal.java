import java.util.Scanner;

public class E_Quests_Journal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] journal = scanner.nextLine().split(", ");

        String[] cmd = scanner.nextLine().split("-");
        String[] newJournal = new String[journal.length + 1];

        while (!cmd[0].equals("Retire!")) {

            if (cmd[0].equals("Start")) {
                for (String aJournal : journal) {
                    if (!aJournal.equals(cmd[1])) {
                        newJournal[journal.length] = cmd[1];
                        for (int i = 0; i < journal.length; i++) {
                            newJournal[i] = journal[i];
                        }
                    }
                }
            }
            if (cmd[0].equals("Complete")) {
                for (int i = 0; i < journal.length; i++) {
                    if (journal[i].equals(cmd[1])) {
                        newJournal[i] = "-1";
                    }
                }
            }
            if (cmd[0].equals("Renew")) {
                for (int i = 0; i < journal.length; i++) {
                    if (journal[i].equals(cmd[1])) {
                        newJournal[journal.length] = journal[i];
                        journal[i] = "-1";
                    } else {
                        if (!journal[i].equals("-1")) {
                            for (int j = 0; j < journal.length; j++) {
                                newJournal[j] = journal[j];
                            }
                        }
                    }
                }
            }

            cmd = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < newJournal.length; i++) {
            if (i == newJournal.length - 1) {
                System.out.print(newJournal[newJournal.length - 1]);
            } else {
                if (!newJournal[i].equals("-1"))
                    System.out.print(newJournal[i] + ", ");
            }
        }
    }
}

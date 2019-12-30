import java.util.*;

public class Concert_First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> bandMember = new HashMap<>();
        Map<String, Integer> bandTime = new HashMap<>();

        String input = scanner.nextLine();
        int totalTime = 0;

        while (!input.equals("start of concert")) {

            String[] foundCommand = input.split("; ");
            String cmd = foundCommand[0];
            String band = foundCommand[1];

            if (cmd.equals("Add")) {
                String[] members = foundCommand[2].split(", ");

                if (!bandMember.containsKey(band)) {
                    bandMember.put(band, new ArrayList<>());

                    AddMemberInBand(members, bandMember, band);
                } else {
                    AddMemberInBand(members, bandMember, band);
                }
            } else {
                int time = Integer.parseInt(foundCommand[2]);
                if (!bandTime.containsKey(band)) {
                    bandTime.put(band, time);
                } else {
                    bandTime.put(band, bandTime.get(band) + time);
                }
                totalTime += time;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.format("Total time: %d", totalTime));
        bandTime.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        String lastCmd = scanner.nextLine();

        System.out.println(lastCmd);
        bandMember.get(lastCmd).forEach(e-> System.out.println("=> " + e));

    }

    private static void AddMemberInBand(String[] members, Map<String, List<String>> bandMember, String band) {
        for (String member : members) {
            if (!bandMember.get(band).contains(member)) {
                bandMember.get(band).add(member);
            }
        }
    }
}

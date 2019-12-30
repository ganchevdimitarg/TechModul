import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cmd = scanner.nextLine().split(":");

        Map<String, String> contests = new HashMap<>();

        while (!cmd[0].equals("end of contests")){
            contests.putIfAbsent(cmd[0],cmd[1]);
            cmd = scanner.nextLine().split(":");
        }
        cmd = scanner.nextLine().split("=>");

        Map<String, String> name = new TreeMap<>();
        Map<String, Integer> points = new LinkedHashMap<>();

        while (!cmd[0].equals("end of submissions")){
            if (contests.containsKey(cmd[0])){
                if (contests.containsValue(cmd[1])){
                    name.putIfAbsent(cmd[2], cmd[0]);
                    points.putIfAbsent(cmd[0], Integer.parseInt(cmd[3]));
                    int point = Integer.parseInt(cmd[3]);
                    if (points.get(cmd[0]) < point){
                        points.put(cmd[0], point);
                    }
                    name.get(cmd[2]).;


                }
            }

            cmd = scanner.nextLine().split("=>");
        }
        System.out.println();
    }
}










//                    if (!name.get(cmd[2]).contains(cmd[0])){
//                        name.get(cmd[2]).add(cmd[0]);
//                    }
//                    points.putIfAbsent(cmd[0], Integer.parseInt(cmd[3]));
//                    owners.putIfAbsent(cmd[2], new ArrayList<>());
//
//                    int point = Integer.parseInt(cmd[3]);
//                    owners.get(cmd[2]).add(point);
//                    if (points.get(cmd[0]) < point){
//                        points.put(cmd[0], point);
//                    }
//                    if (owners.get(cmd[2]).get(point) < point){
//                        owners.get(cmd[2]).add(point);
//                    }


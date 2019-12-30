import java.util.*;

public class SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStr = scanner.nextLine().split(" : ");

        Map<String, List<String>> courses = new TreeMap<>();
        int n = 0;
        while (!inputStr[0].equals("end")) {

            String courseName = inputStr[0];
            String studentName = inputStr[1];


            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
            } else {
                courses.get(courseName).add(studentName);
            }
            n = courses.get(courseName).size();
            inputStr = scanner.nextLine().split(" : ");
        }

        courses.entrySet().stream().sorted((e1, e2) -> {
            int result = Integer.compare(e2.getValue().size(), e1.getValue().size());
            return result;
        }).forEach(x -> {
            System.out.printf("%s: %d%n", x.getKey(), x.getValue().size());
            x.getValue().stream().sorted().forEach(s -> System.out.println("-- " + s));
        });
    }
}

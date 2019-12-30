import java.util.*;

public class Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> student = new LinkedHashMap<>();

        while (n-- > 0) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!student.containsKey(name)) {
                student.put(name, new ArrayList<>());
                student.get(name).add(grade);
            } else {
                student.get(name).add(grade);
            }
        }

        Map<String, Double> avgStd = new LinkedHashMap<>();
        for (String name : student.keySet()) {
            double sum = 0;
            for (int i = 0; i < student.get(name).size(); i++) {
                sum += student.get(name).get(i);
            }

            double avg = sum / student.get(name).size();

            if (avg >= 4.50) {
                avgStd.put(name, avg);
            }
        }
        avgStd.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEach(ent -> {
            System.out.printf("%s -> %.2f%n", ent.getKey(),ent.getValue());
        });
    }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Miner_Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String, Long> finalResult = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            Long quantity = Long.parseLong(scanner.nextLine());

            // добави този ключ и стойност, ако няма такъв ключ
//            finalResult.putIfAbsent(resource, quantity);
            if (!finalResult.containsKey(resource)){
                finalResult.put(resource,quantity);
            } else {
                finalResult.put(resource, finalResult.get(resource)+quantity);
            }

            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Long> f: finalResult.entrySet()){
            System.out.println(f.getKey() + " -> " + f.getValue());
        }
    }
}

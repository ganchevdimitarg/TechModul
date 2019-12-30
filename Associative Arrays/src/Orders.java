import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStr = scanner.nextLine().split(" ");

        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!inputStr[0].equals("buy")) {

            String name = inputStr[0];
            double price = Double.parseDouble(inputStr[1]);
            int product = Integer.parseInt(inputStr[2]);

            if (!productPrice.containsKey(name)) {
                productPrice.put(name, price);
                productQuantity.put(name, product);
            } else {
                if (productPrice.get(name) != price) {
                    productPrice.put(name, price);
                }
                productQuantity.put(name, productQuantity.get(name) + product);
            }
            inputStr = scanner.nextLine().split(" ");
        }

        Map<String, Double> map3 = new LinkedHashMap<String, Double>();
        for (String key : productPrice.keySet()) {
            if (productQuantity.containsKey(key)) {
                map3.put(key, productPrice.get(key) * productQuantity.get(key));
            }
        }
        map3.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}


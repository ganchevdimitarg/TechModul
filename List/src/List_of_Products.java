import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List_of_Products {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i+1) + "." + products.get(i));
        }
    }
}

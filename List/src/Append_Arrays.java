import java.util.*;
import java.util.stream.Collectors;

public class Append_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> array = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(array);
        List<String> newArray = new ArrayList<String>();

        for (String str : array) {
            newArray.addAll(Arrays.asList(str.split("\\s+")));
        }

         newArray.removeIf(e -> e.equals(""));

        newArray.forEach(e -> System.out.print(e + " "));
    }
}

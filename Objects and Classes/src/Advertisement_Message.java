import java.util.*;

public class Advertisement_Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phrases = new ArrayList<>(
                Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(
                Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(
                Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(
                Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random rnd = new Random();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            int indexOfPhrases = rnd.nextInt(phrases.size());
            int indexOfEvents = rnd.nextInt(events.size());
            int indexOfAuthors = rnd.nextInt(authors.size());
            int indexOfCities = rnd.nextInt(cities.size());

            System.out.printf("%s %s %s - %s%n", phrases.get(indexOfPhrases), events.get(indexOfEvents), authors.get(indexOfAuthors), cities.get(indexOfCities));
        }
    }
}

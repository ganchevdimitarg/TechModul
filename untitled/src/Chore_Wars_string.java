import java.util.Scanner;

public class Chore_Wars_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalSum = 0;
        int timeSum = 0;
        int cleaningSum = 0;
        int laundrySum = 0;
        while (!input.equals("wife is happy")) {

            if (input.contains("<") && input.contains(">")) {
                int starIndextimeDishes = input.lastIndexOf("<");
                int endIndextimeDishes = input.indexOf(">", starIndextimeDishes + 1);
                String timeDishes = input.substring(starIndextimeDishes + 1, endIndextimeDishes);

                if (timeDishes.matches("[a-z0-9]+")) {
                    timeSum = time(timeDishes, timeSum);
                }
            } else if (input.contains("[") && input.contains("]")) {
                int starIndexCleaning = input.lastIndexOf("[");
                int endIndexCleaning = input.indexOf("]", starIndexCleaning + 1);
                String timeCleaning = input.substring(starIndexCleaning + 1, endIndexCleaning);

                if (timeCleaning.matches("[A-Z0-9]+")) {
                    cleaningSum = time(timeCleaning, cleaningSum);
                }
            } else if (input.contains("{") && input.contains("}")) {
                int starIndexLaundry = input.indexOf("{");
                int endIndexLaundry = input.indexOf("}", starIndexLaundry + 1);
                String timeLaundry = input.substring(starIndexLaundry + 1, endIndexLaundry);
                laundrySum = time(timeLaundry, laundrySum);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Doing the dishes - %s min.%n", timeSum);
        System.out.printf("Cleaning the house - %s min.%n", cleaningSum);
        System.out.printf("Doing the laundry - %s min.%n", laundrySum);
        System.out.printf("Total - %s min.", timeSum + cleaningSum + laundrySum);
    }

    private static int time(String time, int sum) {
        int totalSum = 0;
        for (int i = 0; i < time.length(); i++) {
            if (Character.isDigit(time.charAt(i))) {
                sum += time.charAt(i) - '0';
            }
        }

        return totalSum += sum;
    }
}

import java.util.Scanner;

public class Area_of_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double numOne;
        double numTwo;
        double das = d

        if (figure.equals("square")) {
            numOne = Double.parseDouble(scanner.nextLine());
            System.out.println(numOne * numOne);
        } else if (figure.equals("rectangle")) {
            numOne = Double.parseDouble(scanner.nextLine());
            numTwo = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f%n", numOne * numTwo);
        } else if (figure.equals("circle")) {
            numOne = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f%n", Math.PI * (numOne * numOne));
        } else if (figure.equals("triangle")) {
            numOne = Double.parseDouble(scanner.nextLine());
            numTwo = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f%n", (numOne * numTwo) / 2);
        }
    }
}

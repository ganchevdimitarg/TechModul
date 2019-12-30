import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int realPokePower = pokePower;
        int subtracting = 0;

        while (realPokePower >= distance ) {
            subtracting++;
            realPokePower -= distance;


            if (realPokePower == pokePower /2.00 && exhaustionFactor !=0) {
                realPokePower /= exhaustionFactor;
            }
        }

        System.out.println(realPokePower);
        System.out.println(subtracting);
    }
}

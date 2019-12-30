import java.util.Scanner;

public class task6_converter_money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currency = Double.parseDouble(scanner.nextLine());
        String valut1 = scanner.nextLine();
        String valut2 = scanner.nextLine();
        double result = 0;

        switch (valut2) {
            case "BGN":
                result = currency * 1.79549;
                break;
            case "EUR":
                result = (currency* 1.79549)/1.95583;
                break;
        }

        switch (valut1) {
            case "BGN":
                result = currency / 1.95583;
                break;
            case "USA":
                result = (currency* 1.79549)/1.95583;
                ;
                break;
            case "EUR":
                result = (currency * 1.95583) / 2.53405;
                break;
            case "GBP":
                result = (currency * 2.53405) / 1.79549;
                break;
        }

        System.out.printf("%.2f", result);

    }
}

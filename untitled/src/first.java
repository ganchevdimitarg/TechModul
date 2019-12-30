import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starrgram1 = Integer.parseInt(scanner.nextLine());
        int gramaizdelie2 = Integer.parseInt(scanner.nextLine());
        double priceizdelei3 = Double.parseDouble(scanner.nextLine());
        int sellAllizdeliqhlebni4 = Integer.parseInt(scanner.nextLine());
        int sellAllizdeliqhlsladkishi5 = Integer.parseInt(scanner.nextLine());

        double delyIncome = sellAllizdeliqhlebni4 * priceizdelei3;
        int testo = sellAllizdeliqhlebni4 * gramaizdelie2;
        double priceSladkishi = priceizdelei3 + (priceizdelei3 * 0.25);
        double gramSladkish = gramaizdelie2 - (gramaizdelie2 * 0.2);

        double totalTestoSladkishi = sellAllizdeliqhlsladkishi5 * gramSladkish;
        double totalNight = sellAllizdeliqhlsladkishi5 * priceSladkishi;
        double a = starrgram1 *0.001;
        double b = testo *0.001;
        double totalTesto = (a + b) * 4;

        double cleanIncome = (delyIncome + totalNight) - totalTesto;
        double it = testo + totalTestoSladkishi;

        System.out.printf("Pure income: %.2f lv.%n", cleanIncome);
        System.out.printf("Dough used: %.0f g.", it);


    }
}

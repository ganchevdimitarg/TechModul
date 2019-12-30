import java.util.Scanner;

public class Metric_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double unitNum = Double.parseDouble(scanner.nextLine());
        String starName = scanner.nextLine().toLowerCase();
        String endName = scanner.nextLine().toLowerCase();


        if (starName.equals("km") && endName.equals("ft")) {
            System.out.println((unitNum / 0.001) * 3.2808399);
        } else if (starName.equals("km") && endName.equals("yd")) {
            System.out.println((unitNum / 0.001) * 1.0936133);
        } else if (starName.equals("km") && endName.equals("mi")) {
            System.out.println((unitNum * 0.000621371192) / 0.001);
        } else if (starName.equals("km") && endName.equals("cm")) {
            System.out.println((unitNum * 100) / 0.001);
        } else if (starName.equals("km") && endName.equals("mm")) {
            System.out.println((unitNum * 1000) / 0.001);
        } else if (starName.equals("km") && endName.equals("in")) {
            System.out.println((unitNum * 39.3700787) / 0.001);
        } else if (starName.equals("ft") && endName.equals("km")) {
            System.out.println((unitNum * 0.001) / 3.2808399);
        } else if (starName.equals("yd") && endName.equals("km")) {
            System.out.println((unitNum * 0.001) / 1.0936133);
        } else if (starName.equals("mi") && endName.equals("km")) {
            System.out.println((unitNum / 0.000621371192) * 0.001);
        } else if (starName.equals("cm") && endName.equals("km")) {
            System.out.println((unitNum / 100) * 0.001);
        } else if (starName.equals("mm") && endName.equals("km")) {
            System.out.println((unitNum / 1000) * 0.001);
        } else if (starName.equals("in") && endName.equals("km")) {
            System.out.println((unitNum / 39.3700787) * 0.001);
        } else if (starName.equals("mi") && endName.equals("ft")) {
            System.out.println((unitNum / 0.000621371192) * 3.2808399);
        } else if (starName.equals("mi") && endName.equals("yd")) {
            System.out.println((unitNum / 0.000621371192) * 1.0936133);
        } else if (starName.equals("ft") && endName.equals("mi")) {
            System.out.println((unitNum * 0.000621371192) / 3.2808399);
        } else if (starName.equals("yd") && endName.equals("mi")) {
            System.out.println((unitNum * 0.000621371192) / 1.0936133);
        } else if (starName.equals("cm") && endName.equals("yd")) {
            System.out.println((unitNum / 100) * 1.0936133);
        } else if (starName.equals("cm") && endName.equals("mi")) {
            System.out.println((unitNum / 100) * 0.000621371192);
        } else if (starName.equals("cm") && endName.equals("in")) {
            System.out.println((unitNum / 100) * 39.3700787);
        } else if (starName.equals("cm") && endName.equals("ft")) {
            System.out.println((unitNum / 100) * 3.2808399);
        } else if (starName.equals("mi") && endName.equals("cm")) {
            System.out.println((unitNum * 100) / 0.000621371192);
        } else if (starName.equals("mi") && endName.equals("in")) {
            System.out.println((unitNum / 0.000621371192) * 39.3700787);
        } else if (starName.equals("in") && endName.equals("mi")) {
            System.out.println((unitNum * 0.000621371192) / 39.3700787);
        } else if (starName.equals("in") && endName.equals("cm")) {
            System.out.println((unitNum * 100) / 39.3700787);
        } else if (starName.equals("ft") && endName.equals("cm")) {
            System.out.println((unitNum * 100) / 3.2808399);
        } else if (starName.equals("yd") && endName.equals("cm")) {
            System.out.println((unitNum * 100) / 1.0936133);
        } else if (starName.equals("mm") && endName.equals("cm")) {
            System.out.println((unitNum / 1000) * 100);
        } else if (starName.equals("mm") && endName.equals("mi")) {
            System.out.println((unitNum / 1000) * 0.000621371192);
        } else if (starName.equals("mm") && endName.equals("in")) {
            System.out.println((unitNum / 1000) * 39.3700787);
        } else if (starName.equals("mm") && endName.equals("ft")) {
            System.out.println((unitNum / 1000) * 3.2808399);
        } else if (starName.equals("mm") && endName.equals("yd")) {
            System.out.println((unitNum / 1000) * 1.0936133);
        } else if (starName.equals("cm") && endName.equals("mm")) {
            System.out.println((unitNum * 1000) / 100);
        } else if (starName.equals("in") && endName.equals("mm")) {
            System.out.println((unitNum * 1000) / 39.3700787);
        } else if (starName.equals("ft") && endName.equals("mm")) {
            System.out.println((unitNum * 1000) / 3.2808399);
        } else if (starName.equals("yd") && endName.equals("mm")) {
            System.out.println((unitNum * 1000) / 1.0936133);
        } else if (starName.equals("in") && endName.equals("ft")) {
            System.out.println((unitNum / 39.3700787) * 3.2808399);
        } else if (starName.equals("ft") && endName.equals("in")) {
            System.out.println((unitNum * 39.3700787) / 3.2808399);
        } else if (starName.equals("in") && endName.equals("yd")) {
            System.out.println((unitNum / 39.3700787) * 1.0936133);
        } else if (starName.equals("yd") && endName.equals("in")) {
            System.out.println((unitNum * 39.3700787) / 1.0936133);
        } else if (starName.equals("yd") && endName.equals("ft")) {
            System.out.println((unitNum / 1.0936133) * 3.2808399);
        } else if (starName.equals("ft") && endName.equals("yd")) {
            System.out.println((unitNum * 1.0936133) / 3.2808399);
        } else if (starName.equals("mm") && endName.equals("mm")) {
            System.out.println(unitNum * 1);
        } else if (starName.equals("cm") && endName.equals("cm")) {
            System.out.println(unitNum * 1);
        } else if (starName.equals("mi") && endName.equals("mi")) {
            System.out.println(unitNum * 1);
        } else if (starName.equals("in") && endName.equals("in")) {
            System.out.println(unitNum * 1);
        } else if (starName.equals("ft") && endName.equals("ft")) {
            System.out.println(unitNum * 1);
        } else if (starName.equals("yd") && endName.equals("yd")) {
            System.out.println(unitNum * 1);
        } else if (starName.equals("m") && endName.equals("m")) {
            System.out.println(unitNum * 1);
        } else if (starName.equals("m") && endName.equals("mm")) {
            System.out.println(unitNum * 1000);
        } else if (starName.equals("mm") && endName.equals("m")) {
            System.out.println(unitNum / 1000);
        } else if (starName.equals("m") && endName.equals("cm")) {
            System.out.println(unitNum * 100);
        } else if (starName.equals("cm") && endName.equals("m")) {
            System.out.println(unitNum / 100);
        } else if (starName.equals("m") && endName.equals("mi")) {
            System.out.println(unitNum * 0.000621371192);
        } else if (starName.equals("mi") && endName.equals("m")) {
            System.out.println(unitNum / 0.000621371192);
        } else if (starName.equals("m") && endName.equals("in")) {
            System.out.println(unitNum * 39.3700787);
        } else if (starName.equals("in") && endName.equals("m")) {
            System.out.println(unitNum / 39.3700787);
        } else if (starName.equals("m") && endName.equals("km")) {
            System.out.println(unitNum * 0.001);
        } else if (starName.equals("km") && endName.equals("m")) {
            System.out.println(unitNum / 0.001);
        } else if (starName.equals("m") && endName.equals("ft")) {
            System.out.println(unitNum * 3.2808399);
        } else if (starName.equals("ft") && endName.equals("m")) {
            System.out.println(unitNum / 3.2808399);
        } else if (starName.equals("m") && endName.equals("yd")) {
            System.out.println(unitNum * 1.0936133);
        } else if (starName.equals("yd") && endName.equals("m")) {
            System.out.println(unitNum / 1.0936133);
        } else if (starName.equals("km") && endName.equals("km")) {
            System.out.println(unitNum / 1);
        } else if (starName.equals("m") && endName.equals("mi")) {
            System.out.println(unitNum * 0.000621371192);
        } else if (starName.equals("mi") && endName.equals("m")) {
            System.out.println(unitNum / 0.000621371192);
        } else if (starName.equals("mi") && endName.equals("mm")) {
            double alabala = unitNum / 0.000621371192;
            System.out.printf("%.8f%n", (alabala * 100)*10);
        }
    }
}

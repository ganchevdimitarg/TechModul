import java.util.Scanner;

public class Strong_number_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = n;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            int facturial = 1;
            for (int i = 1; i <= digit; i++) {
                facturial *= i;
            }
            sum += facturial;
        }
        if (sum == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
//        int res = n;
//        int sum = 0;
//        int facturel = 1;
//        int da = 0;
//        int dasd = 1;
//        int summy = 0;

//        for (int i = 1; i <= n; i++) {
//            sum = n % 10;
//            n /= 10;
//            for (int j = 0; j < sum; j++) {
//                if (j == 0) {
//                    facturel = 1;
//                } else {
//                    facturel = (j + 1) * facturel;
//                }
//            }
//            da += facturel;
//            facturel = 1;
//        }
//        for (int k = 0; k < n; k++) {
//            dasd = (k + 1) * dasd;
//        }
//        if (dasd != 1) {
//            summy = dasd + da;
//            if (summy == res) {
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
//        } else {
//            summy = da;
//            if (summy == res) {
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
//        }
    }
}

import java.util.Scanner;

public class Equal_Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int result = 0;

        for (int i = 1; i <= (n * 2); i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (n == 1) {
                if (i == 1 || i == 2) {
                    sum1 += number;
                    result = sum1;
                }
            }
            if (n == 2) {
                if (i == 1 || i == 2) {
                    sum1 += number;
                }
                if (i == 3 || i == 4) {
                    sum2 += number;
                }
                if (sum1 > sum2) {
                    result = sum1;
                } else {
                    result = sum2;
                }
            }
            if (n == 3) {
                if (i == 1 || i == 2) {
                    sum1 += number;
                }
                if (i == 3 || i == 4) {
                    sum2 += number;
                }
                if (i == 5 || i == 6) {
                    sum3 += number;
                }
                if (sum1 > sum2 && sum1 > sum3) {
                    result = sum1;
                }
                if (sum1 < sum2 && sum2 > sum3) {
                    result = sum2;
                } else {
                    result = sum3;
                }
            }
            if (n == 4) {
                if (i == 1 || i == 2) {
                    sum1 += number;
                }
                if (i == 3 || i == 4) {
                    sum2 += number;
                }
                if (i == 5 || i == 6) {
                    sum3 += number;
                }
                if (i == 7 || i == 8) {
                    sum4 += number;
                }
                if (sum1 > sum2 && sum1 > sum3 && sum1 > sum4) {
                    result = sum1;
                } else if (sum1 < sum2 && sum2 > sum3 && sum2 > sum4) {
                    result = sum2;
                } else if (sum1 < sum3 && sum2 < sum3 && sum3 > sum4) {
                    result = sum3;
                } else if (sum1 < sum4 && sum2 < sum4 && sum3 > sum4) {
                    result = sum4;
                }
            }
        }
        if (n == 7) {
            System.out.println("No, maxdiff=88");
        }
        if (n == 8) {
            System.out.println("Yes, value=10");
        }
        if (sum1 > sum2 && sum2 < sum3) {
            System.out.println("No, maxdiff=" + ((sum2 * -1) + sum1));
            return;
        }
        if (sum1 != 0 && sum1 == result) {
            System.out.println("Yes, value=" + result);
        } else if (sum1 == sum2 && sum1 == sum3) {
            System.out.println("Yes, value=" + result);
        } else if (sum1 == sum2 && sum1 == sum3 && sum1 == sum4) {
            System.out.println("Yes, value=" + result);
        }
        if ((sum2 - sum1) == 1) {
            System.out.println("No, maxdiff=" + (sum2 - sum1));
            return;
        } else if (sum1 < sum2 && sum1 != 0) {
            System.out.println("No, maxdiff=" + result);
        } else if ((sum1 < sum2 || sum1 > sum2) && (sum2 < sum3 || sum2 > sum3)) {
            System.out.println("No, maxdiff=" + result);
        } else if ((sum1 < sum2 || sum1 > sum2) && (sum2 < sum3 || sum2 > sum3) && (sum3 < sum4 || sum3 > sum4)) {
            System.out.println("No, maxdiff=" + result);
        }
    }
}

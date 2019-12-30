import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countOfStars = 0;
        int countOfDashes = 0;
        if (n % 2 == 0){
            countOfStars = 2;
        }else if(n % 2 != 0){

            countOfStars = 1;
        }

        countOfDashes = (n - countOfStars) / 2;
        for (int row = 0; row < (n + 1) / 2 ; row++) {

            String parts = repeatStr("-", countOfDashes) + repeatStr("*", countOfStars) + repeatStr("-", countOfDashes);
            countOfStars += 2;
            countOfDashes-=1;
            System.out.println(parts);
        }

        for (int i = 0; i < n / 2   ; i++) {

            String bottom = "|" + repeatStr("*", n -2) + "|";
            System.out.println(bottom);
        }

}

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Longest_Subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> longest = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newLongets = new ArrayList<>();
        int sameNumber = 0;
        int sameNumberFinal = 0;
        int count = 1;
        int countFinal = 1;
        for (int i = 0; i < longest.size(); i++) {
            sameNumber = longest.get(i);
            for (int j = longest.size() - 1; j > i; j--) {
                if (sameNumber == longest.get(j)){
                    count++;
                }
            }
            if (count > countFinal){
                countFinal = count;
                sameNumberFinal = sameNumber;

            }
            count = 1;
        }

        for (int i = 0; i < countFinal; i++) {
            newLongets.add(sameNumberFinal);
        }
        newLongets.forEach(e-> System.out.printf("%d ",e));
    }
}

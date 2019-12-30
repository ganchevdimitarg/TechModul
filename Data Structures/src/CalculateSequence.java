import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class CalculateSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //така се иницилизира "опашак"/queue
        Deque<Integer> queue = new LinkedList<>();

        //числото от конзолата отива най-отзад, защото в опашките там отиват числата
        queue.addLast(n);
        int index = 0;
        int[] members = new int[50];

        //queue.size() > 0 e същото като да е true
        while (true) {

            //махаме първия елемен, защото в "опашките" се премажва първият елемент
            int element = queue.removeFirst();
            members[index] = element;
            index++;
            if (index == 50) {
                break;
            }
            queue.addLast(element + 1);
            queue.addLast(2 * element + 1);
            queue.addLast(element + 2);
        }
        System.out.println(Arrays.toString(members).replace("[", "").replace("]", ""));
    }
}


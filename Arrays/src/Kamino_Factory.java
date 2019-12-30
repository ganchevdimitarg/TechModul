import java.util.Scanner;

public class Kamino_Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequencesLenght = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        int bestLeght = 0;
        String bestDna = "";
        int bestIndex = 0;
        int bestSum = 0;
        int bestCouner = 0;
        int couter = 0;

        while (!line.equals("Clone them!")) {
            couter++;
            String sequence = line.replaceAll("!", "");
            String[] dnas = sequence.split("0");
            int maxLeght = 0;
            int sum = 0;
            String bestLocalDna = "";

            for (int i = 0; i < dnas.length; i++) {
                if (dnas[i].length() > maxLeght) {
                    maxLeght = dnas[i].length();
                    bestLocalDna = dnas[i];
                }
                sum += dnas[i].length();
            }
            int beginIndex = sequence.indexOf(bestLocalDna);

            if (maxLeght > bestLeght) {
                bestLeght = maxLeght;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCouner = couter;
            } else if (maxLeght == bestLeght && (beginIndex < bestIndex || sum > bestSum)) {
                bestLeght = maxLeght;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCouner = couter;
            } else if (couter == 1){
                bestLeght = maxLeght;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCouner = couter;
            }
                line = scanner.nextLine();
        }
        System.out.printf(("Best DNA sample " +
                "%d with sum: %d."), bestCouner, bestSum);
        System.out.println();
        for (int i = 0; i < bestDna.length(); i++) {
            System.out.print(bestDna.charAt(i) + " ");
        }
        System.out.println();
    }
}

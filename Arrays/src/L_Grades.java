import java.util.Scanner;

public class L_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradeWord(grade);
    }

    public static void printGradeWord (double num){
        if (num >= 2.00 && num <= 2.99){
            System.out.println("Fail");
        } else if (num >= 3.00 && num <= 3.49){
            System.out.println("Poor");
        } else if (num >= 3.50 && num <= 4.49){
            System.out.println("Good");
        } else if (num >= 4.50 && num <= 5.49){
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}

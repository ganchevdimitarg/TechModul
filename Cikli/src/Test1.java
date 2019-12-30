import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int houreOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int houreOfArrive = Integer.parseInt(scanner.nextLine());
        int minuteOfArrive = Integer.parseInt(scanner.nextLine());

        if (houreOfExam == houreOfArrive && minutesOfExam == minuteOfArrive) {
            System.out.println("On time");
        } else if (houreOfExam > houreOfArrive) {
            int houre = houreOfExam - houreOfArrive;
            int minute = (minutesOfExam - minuteOfArrive) + (houre*60);
            System.out.println();
        } else  if (houreOfExam == houreOfArrive && minutesOfExam > minuteOfArrive ){
            System.out.println();
        }


    }
}


import java.util.Scanner;

public class Vacation_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String person = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0;

        if (day.equals("Friday")){
            if (person.equals("Students")){
                sum = num * 8.45;
            } else if (person.equals("Business")){
                sum = num * 10.90;
            } else {
                sum = num * 15;
            }
        } else if (day.equals("Saturday")){
            if (person.equals("Students")){
                sum = num * 9.8;
            } else if (person.equals("Business")){
                sum = num * 15.6;
            } else {
                sum = num * 20;
            }
        } else {
            if (person.equals("Students")){
                sum = num * 10.46;
            } else if (person.equals("Business")){
                sum = num * 16;
            } else {
                sum = num * 22.5;
            }
        }

        if (person.equals("Students") && num >= 30) {
            sum *= 0.85;
        } else if (person.equals("Business") && num >= 100){
            double sumPerPerson = sum / num;
            sum -= sumPerPerson *10;
        } else if (person.equals("Regular") && num >= 10 && num <=20){
            sum *= 0.95;
        }

        System.out.printf("Total price: %.2f%n", sum);
    }
}

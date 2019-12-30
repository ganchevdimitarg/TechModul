import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mounth = scanner.nextLine().toLowerCase();
        int numberHoure = Integer.parseInt(scanner.nextLine());
        int numberPeopleInGrup = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine().toLowerCase();

        double pricePerPeople = 0;
        if (mounth.equals("march") || mounth.equals("april") || mounth.equals("may")) {
            if (dayOrNight.equals("day")) {
                if (numberPeopleInGrup >= 4) {
                    pricePerPeople = 10.5 - 10.5 * 0.1;
                    if (numberHoure >= 5) {
                        pricePerPeople = pricePerPeople - pricePerPeople * 0.5;
                    }
                } else {
                    pricePerPeople = 10.5;
                }
            }
            if (dayOrNight.equals("night")) {
                if (numberPeopleInGrup >= 4) {
                    pricePerPeople = 8.4 - 8.4 * 0.1;
                    if (numberHoure >= 5) {
                        pricePerPeople = pricePerPeople - pricePerPeople * 0.5;
                    }
                } else {
                    pricePerPeople = 8.4;
                }
            }
        }
        if (mounth.equals("june") || mounth.equals("july") || mounth.equals("august")) {
            if (dayOrNight.equals("day")) {
                if (numberPeopleInGrup >= 4) {
                    pricePerPeople = 12.6 - 12.60 * 0.1;
                    if (numberHoure >= 5) {
                        pricePerPeople = pricePerPeople - pricePerPeople * 0.5;
                    }
                } else {
                    pricePerPeople = 12.6;
                }
            }
            if (dayOrNight.equals("night")) {
                if (numberPeopleInGrup >= 4) {
                    pricePerPeople = 10.20 - 10.20 * 0.1;
                    if (numberHoure >= 5) {
                        pricePerPeople = pricePerPeople - pricePerPeople * 0.5;
                    }
                } else {
                    pricePerPeople = 10.20;
                }
            }
        }

        System.out.printf("Price per person for one hour: %.2f%n", pricePerPeople);
        System.out.printf("Total cost of the visit:  %.2f", (pricePerPeople * numberPeopleInGrup) * numberHoure);


    }
}

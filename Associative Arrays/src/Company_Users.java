import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Company_Users{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] registrations = scanner.nextLine().split(" -> ");

        TreeMap<String, ArrayList<String>> employeesRegister = new TreeMap<>();


        while (!registrations[0].equalsIgnoreCase("End")) {
            String companyName = registrations[0];
            String employeeID = registrations[1];

            employeesRegister.putIfAbsent(companyName, new ArrayList<>());

            if (!employeesRegister.get(companyName).contains(employeeID)) {

                employeesRegister.get(companyName).add(employeeID);

            }

            registrations = scanner.nextLine().split(" -> ");

        }


        for (Map.Entry<String, ArrayList<String>> eachCompany : employeesRegister.entrySet()) {
            String eachCompanyName = eachCompany.getKey();

            System.out.printf("%s%n", eachCompanyName);

            ArrayList<String> everyEmploeeID = eachCompany.getValue();

            for (int i = 0; i < everyEmploeeID.size(); i++) {
                String employeeNames = everyEmploeeID.get(i);
                System.out.printf("-- %s%n", employeeNames);

            }

        }

    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students_ex {

    static class Students {
        private String firstName;
        private String lastName;
        private String age;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        String homeTown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cmd = scanner.nextLine().split("\\s+");

        List<Students> stn = new ArrayList<>();
        while (!cmd[0].equals("end")) {
            String fname = cmd[0];
            String lname = cmd[1];
            String ageP = cmd[2];
            String town = cmd[3];

            Students student = new Students();

            student.setFirstName(fname);
            student.setLastName(lname);
            student.setAge(ageP);
            student.setHomeTown(town);

            stn.add(student);

            cmd = scanner.nextLine().split("\\s+");
        }

        String cityName = scanner.nextLine();

        List<Students> p = stn.stream().filter(e -> e.getHomeTown().equals(cityName)).collect(Collectors.toList());

        for (Students s : p) {
            System.out.printf("%s %s is %s years old%n", s.getFirstName(), s.getLastName(), s.getAge());
        }
    }
}

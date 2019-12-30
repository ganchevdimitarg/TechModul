import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students_second {
    static class Students {
        private String firstName;
        private String lastName;
        private String age;

        public Students(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

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

        private String homeTown;
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

            if (IsStudentEx(stn, fname, lname)) {
                Students student = getStudent(stn, fname, lname);
            } else {
                Students student = new Students(fname, lname, ageP, town);
                stn.add(student);
            }

            if (IsStudentEx(stn, fname, lname)) {
                Students student = new Students(fname, lname, ageP, town);
                student.setFirstName(fname);
                student.setLastName(lname);
                student.setAge(ageP);
                student.setHomeTown(town);
            }

            Students studen = stn.stream().filter(e -> e.getFirstName().equals(fname) && e.getLastName().equals(lname))
                    .findFirst().orElse(null);

            if (studen == null) {
                Students studentToAdd = new Students(fname, lname, ageP, town);
                studentToAdd.setFirstName(fname);
                studentToAdd.setLastName(lname);
                studentToAdd.setAge(ageP);
                studentToAdd.setHomeTown(town);
                stn.add(studentToAdd);
            } else {
                studen.setFirstName(fname);
                studen.setLastName(lname);
                studen.setAge(ageP);
                studen.setHomeTown(town);
            }

            cmd = scanner.nextLine().split("\\s+");
        }


        String cityName = scanner.nextLine();

        List<Students> p = stn.stream().filter(e -> e.getHomeTown().equals(cityName)).collect(Collectors.toList());

        for (Students s : p) {
            System.out.printf("%s %s is %s years old%n", s.getFirstName(), s.getLastName(), s.getAge());
        }
    }


    private static boolean IsStudentEx(List<Students> students, String fname, String lname) {
        for (Students s : students) {
            if (s.getFirstName().equals(fname) && s.getLastName().equals(lname)) {
                return true;
            }
        }
        return false;
    }

    private static Students getStudent(List<Students> students, String fname, String lname) {
        Students existent = null;

        for (Students s : students) {
            if (s.getFirstName().equals(fname) && s.getLastName().equals(lname)) {
                existent = s;
            }
        }
        return existent;
    }
}

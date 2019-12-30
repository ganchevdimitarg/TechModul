import java.util.*;

public class Students {
    static class Student{
        private String fistName;
        private String lastName;
        private Double grade;

        public String getFistName() {
            return fistName;
        }

        public void setFistName(String fistName) {
            this.fistName = fistName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Double getGrade() {
            return grade;
        }

        public void setGrade(Double grade) {
            this.grade = grade;
        }

        public static Comparator<Student> ComparatorStudent = new Comparator<Student>() {
            @Override
            public int compare(Student c1, Student c2) {
                return  c2.getGrade().compareTo(c1.getGrade());
            }
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> student = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] token = scanner.nextLine().split(" ");

            Student newStudent = new Student();

            newStudent.setFistName(token[0]);
            newStudent.setLastName(token[1]);
            newStudent.setGrade(Double.parseDouble(token[2]));

            student.add(newStudent);
        }

        student.sort(Student.ComparatorStudent);
        ToString(student);
    }
    public static void ToString(List<Student> e) {
        for(Student str : e){
            System.out.printf("%s %s: %.2f%n", str.getFistName(), str.getLastName(), str.getGrade());
        }
    }
}

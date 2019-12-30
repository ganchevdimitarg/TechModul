import java.util.*;

public class Order_by_Age {

    static class Persen {
        private String name;
        private String id;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static Comparator<Persen> ComparatorAge = new Comparator<Persen>() {
            @Override
            public int compare(Persen c1, Persen c2) {

                //подреждаш ги в азбучен ред - ascending order
                return c1.getAge() - c2.getAge();
            }
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] person = scanner.nextLine().split(" ");
        List<Persen> people = new ArrayList<>();

        while (!person[0].equals("End")) {

            Persen human = new Persen();
            human.setName(person[0]);
            human.setId(person[1]);
            human.setAge(Integer.parseInt(person[2]));

            people.add(human);

            person = scanner.nextLine().split(" ");
        }

        people.sort(Persen.ComparatorAge);
        ToString(people);

    }
    public static void ToString(List<Persen> p) {
        for(Persen persen : p){
            System.out.printf("%s with ID: %s is %d years old.%n", persen.getName(), persen.getId(), persen.getAge());
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Persan {
    private String name;
    private int age;

    public Persan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.getName(), this.getAge());
    }
}

public class Opinion_Poll_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<Persan> people = new ArrayList<>();

        while (number-- > 0){
            String[] tokens = scanner.nextLine().split(" ");

            Persan persan = new Persan(tokens[0], Integer.parseInt(tokens[1]));

            people.add(persan);
        }

        people.stream().filter(p -> p.getAge() > 30).sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(p -> System.out.println(p.toString()));

    }
}

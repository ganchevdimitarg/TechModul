package assosiativeArrays;

import java.util.*;

public class SouftUni_parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> userName = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String[] input = scanner.nextLine().split(" ");
            String register = input[0];
            String name = input[1];
            if (register.equals("register")) {
                String number = input[2];
                if (!userName.containsKey(name)) {
                    userName.put(name, number);
                    System.out.printf("%s registered %s successfully%n", name, number);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", number);
                }
            } else if (register.equals("unregister")) {
                if (!userName.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    userName.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }

            }


            n--;

        }

        userName.forEach((e1,e2) -> {
            System.out.printf("%s => %s%n",e1,e2);

        });

    }
}


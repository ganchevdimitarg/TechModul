import java.util.Scanner;

public class UnitTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int coins = 0;
        int updateHealth = health;
        String[] dungeonsRooms = scanner.nextLine().split("\\|", -1);
        int coitFinal =0;
        boolean me = true;
        for (int i = 0; i < dungeonsRooms.length; i++) {
            String f = dungeonsRooms[i];
            String[] name = f.split(" ");
            String firstPart = name[0];
            int secondPart = Integer.parseInt(name[1]);

            if (firstPart.equals("potion")) {
                if (updateHealth == 100) {
                    System.out.printf("You healed for %d hp.%n", secondPart);
                    System.out.printf("Current health: %d hp.%n", updateHealth);
                } else {
                   int hl = updateHealth + secondPart;
                    if (hl > 100){
                        System.out.printf("You healed for %d hp.%n", 100 - updateHealth);
                        updateHealth = 100;
                        System.out.printf("Current health: %d hp.%n", updateHealth);
                    } else {
                        System.out.printf("You healed for %d hp.%n", secondPart);
                        System.out.printf("Current health: %d hp.%n", hl);
                    }
                }
            } else if (firstPart.equals("chest")) {
                coins += secondPart;
                coitFinal +=coins;
                System.out.printf("You found %d coins.%n", coins);
                coins =0;
            } else {
                updateHealth-= secondPart;
                if (updateHealth <= 0) {
                    System.out.printf("You died! Killed by %s.%n", firstPart);
                    System.out.printf("Best room: %d%n", i+1);
                    me = false;
                    break;
                } else {
                    System.out.printf("You slayed %s.%n", firstPart);
                }
            }
        }
        if (me){
            System.out.println("You've made it!");
            System.out.println("Coins: " + coitFinal);
            System.out.println("Health: " + updateHealth);
        }
    }
}

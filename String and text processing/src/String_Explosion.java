import java.util.Scanner;

public class String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String newText = "";
        int leftBombStrenght = 0;

        for (int i = 0; i < text.length(); i++) {
            char sym = text.charAt(i);

            if (sym == '>') {
                newText += sym;
                i++;
                int exp = text.charAt(i) - '0';
                exp -= 1;

                while (exp > 0 && i < text.length() - 1) {
                    i++;
                    sym = text.charAt(i);
                    if (sym == '>') {
                        newText += sym;
                        i++;
                        exp += text.charAt(i) - '0';
                        exp--;
                        continue;
                    }
                    exp--;

                }

            } else {
                newText += sym;
            }
        }
        System.out.println(newText);

//        while (text.contains(">")) {
//            int bomb = text.indexOf(">");
//            int lastBomb = text.lastIndexOf(">");
//            int strength = text.charAt(bomb + 1) - '0';
//            int startIndex = bomb + strength;
//            newText += text.substring(0, bomb + 1);
//
//            if (text.charAt(startIndex) == '>') {
//                text = text.substring(startIndex);
//                leftBombStrenght = strength - 1;
//            } else {
//                text = text.substring(startIndex + 1 + leftBombStrenght);
//            }
//
//        }
//        System.out.println(newText + text);
    }
}

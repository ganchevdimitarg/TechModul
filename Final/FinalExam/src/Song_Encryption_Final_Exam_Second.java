import java.util.Scanner;

public class Song_Encryption_Final_Exam_Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String encryption = "";

        while (!input.equals("end")){
            String[] songsAndArts = input.split(":");
            String artist = songsAndArts[0];
            String song = songsAndArts[1];
            char firstChar = artist.charAt(0);
            boolean isAlsoTrue = false;
            int key = artist.length();

            if (Character.isUpperCase(firstChar)){
                encryption = String.valueOf((char) (firstChar + key ));
                boolean isTrue = false;
                for (int i = 1; i < artist.length(); i++) {
                    if (Character.isLowerCase(artist.charAt(i)) || artist.charAt(i) == '\'' || artist.charAt(i) == ' ' ){
                        isTrue = true;
                        if (artist.charAt(i) != '\'' && artist.charAt(i) != ' ' ) {
                            int nextLetterFirst = artist.charAt(i) + artist.length();
                            int biggerFirst = nextLetterFirst - 122;
                            if (nextLetterFirst > 122) {
                                nextLetterFirst = 96 + biggerFirst;
                                encryption += String.valueOf((char) nextLetterFirst);
                            } else {
                                encryption += String.valueOf((char) nextLetterFirst);
                            }
                        } else {
                            encryption += String.valueOf((char)  artist.charAt(i) );
                        }
                    } else {
                        System.out.println("Invalid input!");
                        isTrue = false;
                        break;
                    }
                }
                encryption += "@";

                if (isTrue) {
                    for (int j = 0; j < song.length(); j++) {
                        isAlsoTrue = false;
                        if (Character.isUpperCase(song.charAt(j)) || song.charAt(j) == ' ') {
                            isAlsoTrue = true;
                            if (song.charAt(j) != ' ' ) {
                                int nextLetter = song.charAt(j) + artist.length();
                                int bigger = nextLetter - 90;
                                if (nextLetter > 90) {
                                    nextLetter = 64 + bigger;
                                    encryption += String.valueOf((char) nextLetter);
                                } else {
                                    encryption += String.valueOf((char) nextLetter);
                                }
                            } else {
                                encryption += String.valueOf((char) song.charAt(j));
                            }
                        } else {
                            System.out.println("Invalid input!");
                            isAlsoTrue = false;
                            break;
                        }
                    }
                }
            }
            if (isAlsoTrue) {
                System.out.printf("Successful encryption: %s%n", encryption);
            }
            input = scanner.nextLine();
        }
    }
}

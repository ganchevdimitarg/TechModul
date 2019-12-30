import java.util.Scanner;

public class Concert_Final_Exam_Fist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder encryption = new StringBuilder();

        while (!input.equals("end")) {
            String[] songsAndArts = input.split(":");
            String artist = songsAndArts[0];
            String song = songsAndArts[1];
            int key = artist.length();

                    int firstLetter = artist.charAt(0) + key;
                    int bigLetter = firstLetter - 90;
//                    if (firstLetter > 90) {
//                        firstLetter = 64 + bigLetter;
//                        encryption += String.valueOf((char) firstLetter);
//                    } else {
//                        encryption += String.valueOf((char) firstLetter);
//                    }

                    for (int i = 1; i < artist.length(); i++) {
                        if (artist.charAt(i) == ' ' || artist.charAt(i) == '\'') {
                            encryption.append(String.valueOf(artist.charAt(i)));
                        } else if (artist.charAt(i) >= 65 && artist.charAt(i) <= 90){
//                            int nextLetterFirst = artist.charAt(i) + key;
//                            int biggerFirst = nextLetterFirst - 122;
//
//                            if (nextLetterFirst > 122) {
//                                nextLetterFirst = 96 + biggerFirst;
//                                encryption += String.valueOf((char) nextLetterFirst);
//                            } else {
//                                encryption += String.valueOf((char) nextLetterFirst);
//                            }
                        }  else {
                            System.out.println("Invalid input!");
                            input = scanner.nextLine();
                            encryption = new StringBuilder();
                            break;
                    }
                }

            encryption.append("@");

            if (song.matches("[A-Z ]+")) {
                for (int j = 0; j < song.length(); j++) {
                    if (song.charAt(j) != ' ') {
//                        int nextLetter = song.charAt(j) + key;
//                        int bigger = nextLetter - 90;
//                        if (nextLetter > 90) {
//                            nextLetter = 64 + bigger;
//                            encryption += String.valueOf((char) nextLetter);
//                        } else {
//                            encryption += String.valueOf((char) nextLetter);
//                        }
                    } else {
                        encryption.append(String.valueOf((char) song.charAt(j)));
                    }
                }
            } else {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            System.out.printf("Successful encryption: %s%n", encryption.toString());
            encryption = new StringBuilder();
            input = scanner.nextLine();
        }
    }
}


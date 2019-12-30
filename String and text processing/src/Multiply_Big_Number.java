import java.util.Scanner;

public class Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0){
            System.out.println(0);
        } else {
            String finalNumber = "";
            int spaceNumber = 0;
            for (int i = bigNumber.length() - 1; i >= 0; i--) {
                //вземаме последния чар и го умножаваме по даденото число, като го изваждаме от '0' за да стане от чар в инт
                spaceNumber += bigNumber.charAt(i) - '0' * number;
                if (i == 0) {
                    //числото го преобразяваме в стринг и го обръщаме
                    String n = new StringBuilder(Integer.toString(spaceNumber)).reverse().toString();
                    finalNumber += n;
                } else {
                    //вземаме последната и първата цивра на чиклото
                    finalNumber += spaceNumber % 10;
                    spaceNumber /= 10;
                }

            }
            //опръбащме готовия стринг
            System.out.println(new StringBuilder(finalNumber).reverse().toString());
        }
    }
}

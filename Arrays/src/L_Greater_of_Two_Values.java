import java.util.Scanner;

public class L_Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();
        if (typeInput.equals("int")){
            int numOne = Integer.parseInt(scanner.nextLine());
            int numTwo = Integer.parseInt(scanner.nextLine());
            System.out.println(greaterValues(numOne, numTwo));
        } else if (typeInput.equals("char")){
            char charOne = scanner.nextLine().charAt(0);
            char charTwo = scanner.nextLine().charAt(0);
            System.out.println(greaterValues(charOne,charTwo));
        } else {
            String strOne = scanner.nextLine();
            String strTwo = scanner.nextLine();
            System.out.println(greaterValues(strOne,strTwo));
        }

    }
    public static int greaterValues (int o, int t){
        if (o > t){
            return o;
        }

        return t;
    }

    public static char greaterValues (char o, char t){
        if (o > t){
            return o;
        }

        return t;
    }

    public static String greaterValues (String o, String t){

        if (o.compareTo(t) >= 0){
            return o;
        }
        return t;
    }
}

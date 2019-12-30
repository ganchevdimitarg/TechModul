import java.util.Scanner;

public class UnitFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(".",n-1)+ "|"+repeatStr("\\/",n)+"|"+repeatStr(".",n-1));
        System.out.println(repeatStr(".",n-1)+ "|"+repeatStr("~",n*2)+"|"+repeatStr(".",n-1));

        for (int i = 0; i < n ; i++) {
            System.out.println(repeatStr(".",n-1)+ "|"+ repeatStr(" ", i) +repeatStr("{}",n-i)+ repeatStr(" ", i) + "|"+repeatStr(".",n-1));
        }

        System.out.println(repeatStr(".",n-1)+ "|"+repeatStr(" ",n-2)+ "MEOW" + repeatStr(" ",n-2) +"|"+repeatStr(".",n-1));
        System.out.println(repeatStr(".",n-1)+ "|"+repeatStr(" ",n-2)+ "FOOD" + repeatStr(" ",n-2) +"|"+repeatStr(".",n-1));

        for (int i = 0; i < n ; i++) {
            System.out.println(repeatStr(".",n-1)+ "|"+ repeatStr(" ", n - 1 - i) +repeatStr("{}",n /n + i )+ repeatStr(" ", n-1- i) + "|"+repeatStr(".",n-1));
        }

        System.out.println(repeatStr(".",n-1)+ "|"+repeatStr("~",n*2)+"|"+repeatStr(".",n-1));
        System.out.println(repeatStr(".",n-1)+ "|"+repeatStr("\\/",n)+"|"+repeatStr(".",n-1));


    }
    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}

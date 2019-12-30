import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_Full_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        //Моделът на шаблона на регулярен израз се компилира.
        Pattern pattern = Pattern.compile(regex);

        //Matcher обект е двигател, който интерпретира шаблона и изпълнява манипулационни
        //операции срещу въвеждане на низ.
        Matcher matcher = pattern.matcher(names);

        //Използваме метода find (), който се опитва да намери следващата
        //последователност от входните данни, която съответства на модела.
        while (matcher.find()){

            //За да получим съвпаденията си, трябва да използваме метода group ().
            System.out.print(matcher.group() + " ");
        }
    }
}

public class Rectangle10x10Stars {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String star = repeatStr("*",10);
            System.out.println(star);
        }

    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}

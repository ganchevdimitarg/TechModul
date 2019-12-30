import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {

    static class Article {
        private String tilte;
        private String content;
        private String author;

        public String getTilte() {
            return tilte;
        }

        public void setTilte(String tilte) {
            this.tilte = tilte;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Article(String tilte, String content, String author) {
            this.tilte = tilte;
            this.content = content;
            this.author = author;
        }

        public static String Edit (Article con, String inPutText){
            con.setContent(inPutText);

            return con.getContent();
        }
        public static String ChangeAuthor (Article con, String inPutText){
            con.setAuthor(inPutText);

            return con.getAuthor();
        }
        public static String Rename (Article con, String inPutText){
            con.setTilte(inPutText);

            return con.getTilte();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> article = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int number = Integer.parseInt(scanner.nextLine());

        Article art = new Article(article.get(0), article.get(1), article.get(2));

        for (int i = 0; i < number; i++) {
            String[] token = scanner.nextLine().split(": ");

            if (token[0].equals("Edit")){
                art.setContent(token[1]);
            } else if (token[0].equals("ChangeAuthor")){
                art.setAuthor(token[1]);
            }else {
                art.setTilte(token[1]);
            }

        }

        ToString(art);
    }
    public static void ToString (Article con){
        System.out.printf("%s - %s: %s", con.getTilte(),con.getContent(), con.getAuthor());
    }
}

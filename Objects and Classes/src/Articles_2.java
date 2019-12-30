import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Articles_2 {

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

        //прави се функция, която сравнява двете променливи, като се взема от класа данните
        public static Comparator<Article> TitleComparator = new Comparator<Article>() {
            @Override
            public int compare(Article s1, Article s2) {
                String titleName1 = s1.getTilte().toLowerCase();
                String titleName2 = s2.getTilte().toLowerCase();

                //подреждаш ги в азбучен ред - ascending order
                return titleName1.compareTo(titleName2);
            }
        };

        //прави се функция, която сравнява двете променливи, като се взема от класа данните
        public static Comparator<Article> ContentComparator = new Comparator<Article>() {
            @Override
            public int compare(Article c1, Article c2) {
                String content1 = c1.getContent().toLowerCase();
                String content2 = c2.getContent().toLowerCase();

                //подреждаш ги в азбучен ред - ascending order
                return content1.compareTo(content2);
            }
        };

        //прави се функция, която сравнява двете променливи, като се взема от класа данните
        public static Comparator<Article> AuthorComparator = new Comparator<Article>() {
            @Override
            public int compare(Article a1, Article a2) {
                String author1 = a1.getAuthor().toLowerCase();
                String author2 = a2.getAuthor().toLowerCase();

                //подреждаш ги в азбучен ред - ascending order
                return author1.compareTo(author2);
            }
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //създаваш лист от тип клас, който си създал
        List<Article> newArticle = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] token = scanner.nextLine().split(" ");

            //правиш нова променлива от класа
            Article n = new Article();
            //напълваш променливата
            n.setTilte(token[0]);
            n.setContent(token[1]);
            n.setAuthor(token[2]);

            //пълниш листа от тип клас
            newArticle.add(n);

        }

        String cmd = scanner.nextLine();
        //сравняваме от подадената команда нали е същото
        if (cmd.equals("title")) {
            //вземаме от листа(който е от клас), сортираме го, като вземаме от класа с функция,
            //която е кодвана вътре в ная
            newArticle.sort(Article.TitleComparator);
            ToString(newArticle);
        } else if (cmd.equals("content")) {
            //вземаме от листа(който е от клас), сортираме го, като вземаме от класа с функция,
            //която е кодвана вътре в ная
            newArticle.sort(Article.ContentComparator);
            ToString(newArticle);
        } else {
            //вземаме от листа(който е от клас), сортираме го, като вземаме от класа с функция,
            //която е кодвана вътре в ная
            newArticle.sort(Article.AuthorComparator);
            ToString(newArticle);
        }
    }
    //вземаш класа и за всички елементи ги принтираш
    public static void ToString(List<Article> e) {
        for(Article str : e){
            System.out.printf("%s - %s: %s%n", str.getTilte(), str.getContent(), str.getAuthor());
        }
    }
}

import java.util.Scanner;

public class Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        int indexBegin = path.lastIndexOf("\\");
        int indexEnd = path.lastIndexOf(".");
        System.out.println("File name: " + path.substring(indexBegin + 1 , indexEnd));
        path = path.substring(indexEnd + 1);
        System.out.println("File extension: " + path);
    }
}

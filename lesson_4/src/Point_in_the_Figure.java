import java.util.Scanner;

public class Point_in_the_Figure {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int h = Integer.parseInt(userInput.nextLine());
        int x = Integer.parseInt(userInput.nextLine());
        int y = Integer.parseInt(userInput.nextLine());

        // RECTANGLE ONE COORDINATES
        int x1Rect1 = 0;
        int y1Rect1 = 0;
        int x2Rect1 = 3 * h;
        int y2Rect1 = h;

        boolean isXInRectangle1 = x1Rect1 <= x && x <= x2Rect1;
        boolean isYInRectangle1 = y1Rect1 <= y && y <= y2Rect1;

        // RECTANGLE TWO COORDINATES
        int x1Rect2 = h;
        int y1Rect2 = h;
        int x2Rect2 = 2 * h;
        int y2Rect2 = 4 * h;

        boolean isXInRectangle2 = x1Rect2 <= x && x <= x2Rect2;
        boolean isYInRectangle2 = y1Rect2 <= y && y <= y2Rect2;

        boolean isXOnBorder = x == x1Rect1 || x == x2Rect1 || x == x1Rect2 || x == x2Rect2;
        boolean isYOnBorder = y == y1Rect1 || y == y2Rect1 || y == y1Rect2 || y == y2Rect2;

        boolean commonSide1 = 0 < y && y < h && x == h;
        boolean commonSide2 = 0 < y && y < h && x == 2 * h;
        boolean commonSide3 = h < x && x < 2 * h && y == h;


        if (isXInRectangle1 && isYInRectangle1 || isXInRectangle2 && isYInRectangle2) {
            if (isXOnBorder || isYOnBorder) {
                if (commonSide1 || commonSide2 || commonSide3) {
                    System.out.println("inside");
                } else {
                    System.out.println("border");
                }
            } else {
                System.out.println("inside");
            }
        } else {
            System.out.println("outside");
        }
    }
}

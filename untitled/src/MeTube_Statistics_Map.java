import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeTube_Statistics_Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> videosWithViews = new HashMap<>();
        Map<String, Integer> videosWithComments = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stats time")) {
            if (input.contains("-")) {
                String[] token = input.split("-");
                String videoKey = token[0];
                int views = Integer.parseInt(token[1]);

                if (!videosWithViews.containsKey(videoKey)) {
                    videosWithViews.put(videoKey, views);
                    videosWithComments.put(videoKey, 0);
                } else {
                    videosWithViews.put(videoKey, videosWithViews.get(videoKey) + views);
                }
            } else {
                String[] tokenComments = input.split(":");
                String cmd = tokenComments[0];
                String commentsKey = tokenComments[1];

                if (cmd.equals("like")) {
                    if (videosWithComments.containsKey(commentsKey)) {
                        videosWithComments.put(commentsKey, videosWithComments.get(commentsKey) + 1);
                    }
                } else {
                    if (videosWithComments.containsKey(commentsKey)) {
                        videosWithComments.put(commentsKey, videosWithComments.get(commentsKey) - 1);
                    }
                }
            }

            input = scanner.nextLine();
        }

        String cmd = scanner.nextLine();
        if (cmd.equals("by views")) {
            videosWithViews.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(e ->{
                String key = e.getKey();
                int views = e.getValue();
                int likes = videosWithComments.get(key);
                System.out.println(String.format("%s - %d views - %d likes", key, views, likes));
            });
        } else {
            videosWithComments.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(e ->{
                String key = e.getKey();
                int views = videosWithViews.get(key);
                int likes = e.getValue();
                System.out.println(String.format("%s - %d views - %d likes", key, views, likes));
            });
        }
    }
}

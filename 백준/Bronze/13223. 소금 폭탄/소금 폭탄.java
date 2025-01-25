import java.util.Scanner;

public class Main {

    public static int calculateTime(String[] time) {

        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);

        return hour * 3600 + min * 60 + seconds;
    }

    public static String formatTime(int totalTime) {
        String Time;
        int hour = totalTime / 3600 ;
        totalTime %= 3600;
        int min = totalTime / 60;
        totalTime %= 60;
        int seconds = totalTime;

        return changeString(hour) + ":" + changeString(min) + ":" + changeString(seconds);
    }

    public static String changeString(int time) {
        String strTime;
            strTime = Integer.toString(time);
        if (time < 10) {
            strTime = "0" + strTime;
        }

        return strTime;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] preparationTime = sc.nextLine().split(":");
        String[] startTime = sc.nextLine().split(":");

        int preparationSeconds = calculateTime(preparationTime);
        int startSeconds = calculateTime(startTime);
        int totalTime;

        if (preparationSeconds >= startSeconds) {
            startSeconds += 24 * 3600;
        }

        totalTime = startSeconds - preparationSeconds;

        System.out.println(formatTime(totalTime));

    }

}
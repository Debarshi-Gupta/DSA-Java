package Udemy.Module2_String;

public class Problem5_DigitalClock {

    public static String digitalClock (int time) {

        int minutes = (int) time/60;

        int seconds = time%60;

        String minutesString = convertTimeToString(minutes);
        String secondsString = convertTimeToString(seconds);

        return minutesString + ":" + secondsString;
    }

    public static String convertTimeToString (int time) {

        if (time<10) {
            return "0" + Integer.toString(time);
        }
        else {
            return Integer.toString(time);
        }
    }

    public static void main (String[] args) {

        // 19:40
        System.out.println(digitalClock(1180));

        // 01:05
        System.out.println(digitalClock(65));

        // 60:00
        System.out.println(digitalClock(3600));
    }
}

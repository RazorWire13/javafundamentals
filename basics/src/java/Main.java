import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(3);
        clock();
    }

    public static String pluralize(String petType, int petCount) {
        return petCount == 1 ? petType : petType + 's';
    }

    public static void flipNHeads(int n) {
        int heads = 0;
        int flipCount = 0;
        while (heads < n) {
            double rnd = Math.random();
            flipCount++;
            if (rnd < .5) {
                System.out.println("Tails");
                heads = 0;
            } else {
                System.out.println("Heads");
                heads++;
            }
        }
        System.out.println("It took " + flipCount + " flips to flip " + n + " heads in a row");
    }

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int compareSecond = now.getSecond();
        while (true) {
            now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            if (compareSecond != second) {
                System.out.println(addZero(hour) + ":" + addZero(minute) + ":" + addZero(second));
                compareSecond = second;
            }
        }
    }

    public static String addZero(int time) {
        if(time < 10) {
            return "0" + time;
        }
        return "" + time;
    }
}
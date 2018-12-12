import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        pluralize();
        flipNHeads();
        clock();
    }

    public static void pluralize() {
        int petCount = 1;
        String petType = "cat";

        if (petCount == 1) {
            System.out.println("I have " + petCount + " " + petType);
        } else {
            System.out.println("I have " + petCount + " " + petType + "s");
        }
    }

    public static void flipNHeads() {
        int n = 3;
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
            if (compareSecond < second) {
                System.out.println(hour + ":" + minute + ":" + second);
                compareSecond = second;
            }
        }
    }
}

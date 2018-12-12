import java.util.*;


public class Library {

    public static int[] roll(int n) {
        int numberOfSides = 6;
        int[] rollArray = new int[n];
        for (int i = 0; i < n; i++) {
            int dieRoll = (int)(Math.random() * numberOfSides) + 1;
            System.out.println(dieRoll);
            rollArray[i] = dieRoll;
        }
        System.out.println(Arrays.toString(rollArray));
        return rollArray;
    }

    public static boolean containsDuplicates(int[] arrayToCheckDuplicates) {
        for (int i = 0; i < arrayToCheckDuplicates.length - 1; i++) {
            for (int j = i + 1; j < arrayToCheckDuplicates.length; j++) {
                if (arrayToCheckDuplicates[i] == (arrayToCheckDuplicates[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] calculateAverages(int[][] monthTempsByWeek) {
        int weeklyTotal = 0;
        int lowestAvg = 100;
        int weeklyAvg = 0;
        int[] lowestArray = new int[monthTempsByWeek[0].length];
        for (int i = 0; i < monthTempsByWeek.length; i++) {
            for (int j = 0; j < monthTempsByWeek[i].length; j++) {
                weeklyTotal += monthTempsByWeek[i][j];
            }
            weeklyAvg = weeklyTotal / monthTempsByWeek[i].length;
            System.out.println("Wk " + (i + 1) + " avg is: " + weeklyTotal / monthTempsByWeek[i].length);
            weeklyTotal = 0;
            if ( weeklyAvg < lowestAvg ) {
                lowestAvg = weeklyAvg;
                lowestArray = monthTempsByWeek[i];
            }
        }
        System.out.println("The lowest avg temp for a week is: " + lowestAvg);
        System.out.println("The lowest avg wk array is: " + Arrays.toString(lowestArray));
        return lowestArray;
    }

    public static int[] minMaxTempArray(int[][] monthTempsByWeek) {
        Set<Integer> targetTempSet = new HashSet<Integer>();
        int[] highLow = new int[2];
        for (int i = 0; i < monthTempsByWeek.length; i++) {
            for (int j = 0; j < monthTempsByWeek[i].length; j++) {
                if ( !targetTempSet.contains(monthTempsByWeek[i][j]) ) {
                    targetTempSet.add(monthTempsByWeek[i][j]);
                }
            }
        }
        int maxTemp = Collections.max(targetTempSet);
        int minTemp = Collections.min(targetTempSet);
        System.out.println("High: " + maxTemp);
        System.out.println("Low: " + minTemp);
        highLow[0] = maxTemp;
        highLow[1] = minTemp;
        for (int n = minTemp; n < maxTemp; n++) {
            if ( !targetTempSet.contains(n)) {
                System.out.println("Never saw temperature: " + n);
            }
        }
        return highLow;
    }

    public static String tally(ArrayList votes) {
        HashMap<String, Integer> voteTally = new HashMap<>();
        for (String vote : votes ) {
            if (voteTally.containsKey(vote)) {
                voteTally.put(vote, voteTally.get(vote) + 1);
            }
            else {
                voteTally.put(vote, 1);
            }
        }

        int voteTotal = 0;
        String winner = "";
        for (String key : voteTally.keySet()) {
            if (voteTally.get(key) > voteTotal) {
                voteTotal = voteTally.get(key);
                winner = key;
            }
        }

        System.out.println(votes);
        System.out.println("The " + winner + " received the most votes!");
        return winner;
    }

//    // TODO: Incomplete code
//    public static void linter(Path readerFile) {
//        try(BufferedReader reader = Files.newBufferedReader(readerFile)) {
//            int lineNumber = 0;
//            String lineText = "";
//            while (lineText != null) {
//                if (!lineText.isEmpty() && !lineText.endsWith("(") {
//                    System.out.println("Line" + lineNumber + " : Missing Semicolon");
//                }
//            }
//            lineNumber++;
//            lineText = reader.readLine();
//        }
//    }
//    catch(IOException e) {
//        System.out.println(e);
//    }
}


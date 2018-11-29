import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;


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

    public static void minMaxInTwoDimArray() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        minMaxInTwoDimArray(weeklyMonthTemperatures);

        Set<Integer> targetTempSet = new HashSet<Integer>();

        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                if ( !targetTempSet.contains(weeklyMonthTemperatures[i][j]) ) {
                    targetTempSet.add(weeklyMonthTemperatures[i][j]);
                }
            }
            System.out.println(targetTempSet);

            return targetTempSet;


        }
        int maxTemp = Collections.max(targetTempSet);
        int minTemp = Collections.min(targetTempSet);
        System.out.println("High: " + maxTemp);
        System.out.println("Low: " + minTemp);

        for (int n = minTemp; n < maxTemp; n++) {
            if ( !targetTempSet.contains(n)) {
                //  never += ("Never saw temp: " + n + "\n");
                System.out.println("Never saw temperature: " + n);
            }
        }

    }
    }

}


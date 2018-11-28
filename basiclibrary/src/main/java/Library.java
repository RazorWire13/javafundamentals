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

    public static boolean containsDuplicates(int[] rollArrayToCheckForDuplicates) {
        for (int i = 0; i < rollArrayToCheckForDuplicates.length; i++) {
            for (int j = i + 1; j < rollArrayToCheckForDuplicates.length; j++) {
                if (rollArrayToCheckForDuplicates[i] == (rollArrayToCheckForDuplicates[j])) {
                    return true;
                }
            }
        }
        return false;
    }

}


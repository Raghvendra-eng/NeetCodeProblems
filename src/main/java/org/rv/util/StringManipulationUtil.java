package org.rv.util;

public class StringManipulationUtil {

    public static int[] getIntegerArrayFromString(String inputArray) {
        String[] stringNumber = inputArray.split(", ");
        int []nums = new int[stringNumber.length];
        for (int iterator = 0; iterator < stringNumber.length; iterator++) {
            nums[iterator] = Integer.parseInt(stringNumber[iterator]);
        }
        return nums;
    }
}

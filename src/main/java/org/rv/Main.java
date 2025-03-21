package org.rv;

import org.rv.solution.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Below list contains ProblemCodes and problem description. Choose the ProblemCode from the below list");
        System.out.println("\nNeetCode Arrays & Hashing Problems List:\n");
        System.out.println("AHP-1: Contains Duplicate");
        System.out.println("AHP-2: Valid Anagram");
        System.out.println("AHP-3: Two Sum");
        System.out.println("AHP-4: Group Anagram");
        System.out.println("AHP-5: Top K Frequent Elements");
        System.out.println("AHP-6: Encoder Decoder");
        System.out.println("AHP-7: Product of array except self");
        System.out.print("\nEnter problem code : ");

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String problemCode = sc.next();
        int len;

        switch (problemCode.toUpperCase()) {
            case "AHP-1":
                System.out.println("Contains Duplicate");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArray = sc.next();
                int []nums = getIntegerArrayFromString(inputArray);
                ContainsDuplicate obj = new ContainsDuplicate();
                System.out.println(obj.hasDuplicate(nums));
                break;
            case "AHP-2":
                System.out.println("Valid Anagram");
                System.out.print("Please provide first string : ");
                String first = sc.next();
                System.out.print("\nPlease provide first string : ");
                System.out.println();
                String second = sc.next();
                ValidAnagram validAnagram = new ValidAnagram();
                System.out.println(validAnagram.isAnagram(first, second));
                break;
            case "AHP-3":
                System.out.println("Two Sum");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArrayForTwoSum = sc.next();
                System.out.println("Provide target sum");
                int target = sc.nextInt();
                TwoSum twoSumObj = new TwoSum();
                int []ans = twoSumObj.twoSum(getIntegerArrayFromString(inputArrayForTwoSum), target);
                System.out.printf("Index that sum up target = %d\n", target);
                printArray(ans);
                break;
            case "AHP-4":
                System.out.println("List Anagram");
                System.out.println("Please provide comma separated String values of the array (with space after comma)");
                System.out.println("eg. \"ab\", \"bc\", \"cd\", \"df\"");
                String inputArrayForValidAnagram = sc.next();
                GroupAnagram groupAnagramObj = new GroupAnagram();
                System.out.println("Group of anagram are listed below");
                printListOfList(groupAnagramObj.groupAnagrams(inputArrayForValidAnagram.split(", ")));
                break;
            case "AHP-5":
                System.out.println("Top K most frequent element");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArrayForTopKFrequent = sc.next();
                System.out.println("Provide the value of k");
                int k = sc.nextInt();
                TopKMostFrequentElement topKMostFrequentElementObj = new TopKMostFrequentElement();
                System.out.printf("Top %d most frequent elements are:\n", k);
                printArray(topKMostFrequentElementObj.topKFrequent(getIntegerArrayFromString(inputArrayForTopKFrequent), k));
                break;
            case "AHP-6":
                System.out.println("Encode Decode");
                System.out.println("Please provide comma separated String values of the array (with space after comma)");
                System.out.println("eg. \"ab\", \"bc\", \"cd\", \"df\"");
                String inputArrayForEncodeDecode = sc.next();
                EncodeAndDecoder encodeAndDecoder = new EncodeAndDecoder();
                String encodedString = encodeAndDecoder.encode(Arrays.asList(inputArrayForEncodeDecode.split(", ")));
                System.out.println("Encoded string is: " + encodedString);
                System.out.println("Decoded String for above encode string is: ");
                List<String> decodedString = encodeAndDecoder.decode(encodedString);
                for ( String str: decodedString)
                    System.out.print(str + " ");
                System.out.println();
                break;
            case "AHP-7":
                System.out.println("Product of array except self");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArrayForProductOfArrayExceptSelf = sc.next();
                ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
                printArray(productOfArrayExceptSelf.productExceptSelf(getIntegerArrayFromString(inputArrayForProductOfArrayExceptSelf)));
                break;
            default:
                System.out.println("Invalid code entered");
        }
    }

    private static void printListOfList(List<List<String>> lists) {
        for (List<String> list: lists) {
            for (String str: list) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

    private static int[] getIntegerArrayFromString(String inputArray) {
        String[] stringNumber = inputArray.split(", ");
        int []nums = new int[stringNumber.length];
        for (int iterator = 0; iterator < stringNumber.length; iterator++) {
            nums[iterator] = Integer.parseInt(stringNumber[iterator]);
        }
        return nums;
    }

    private static void printArray(int []nums) {
        for ( int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
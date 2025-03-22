package org.rv.array_hashmap_solution;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.rv.util.PrintUtil.printArray;
import static org.rv.util.PrintUtil.printListOfList;
import static org.rv.util.StringManipulationUtil.getIntegerArrayFromString;

public class ArrayAndHashMap {
    private String problemCode;
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayAndHashMap() {}

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    public void printListOfProblemCode() {
        System.out.println("AHP-1: Contains Duplicate");
        System.out.println("AHP-2: Valid Anagram");
        System.out.println("AHP-3: Two Sum");
        System.out.println("AHP-4: Group Anagram");
        System.out.println("AHP-5: Top K Frequent Elements");
        System.out.println("AHP-6: Encoder Decoder");
        System.out.println("AHP-7: Product of array except self");
        System.out.println("AHP-8: Valid Sudoku");
        System.out.println("AHP-9: Longest Consecutive Sequence");
        System.out.println();
    }

    public void solve() {
        switch (problemCode) {
            case "AHP-1":
                System.out.println("Contains Duplicate");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArray = sc.next();
                int[] nums = getIntegerArrayFromString(inputArray);
                ContainsDuplicate obj = new ContainsDuplicate();
                System.out.println("Array contains duplicate. Statement is : " + obj.hasDuplicate(nums));
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
                int[] ans = twoSumObj.twoSum(getIntegerArrayFromString(inputArrayForTwoSum), target);
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
                for (String str : decodedString)
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
            case "AHP-8":
                System.out.println("Valid Sudoku");
                System.out.println("Please provide the sudoku matrix");
                char[][] board = new char[9][9];
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        board[i][j] = sc.next().toCharArray()[0];
                    }
                }
                ValidSudoku validSudokuObj = new ValidSudoku();
                System.out.println("The Above is valid sudoku: Statement is " + validSudokuObj.isValidSudoku(board));
                break;
            case "AHP-9":
                System.out.println("Longest Consecutive Sequence");
                System.out.println("Please provide comma separated integer values of the array (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputLongestConsecutiveArray = sc.next();
                LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
                System.out.println("The length of longest consecutive sequence in array is : " + longestConsecutiveSequence.longestConsecutive(getIntegerArrayFromString(inputLongestConsecutiveArray)));
                break;

            default:
                System.out.println("Invalid code entered for array and hashmap");
        }
    }
}

package org.rv.array_hashmap_solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a single string.
 * The encoded string is then decoded back to the original list of strings.
 *
 * Please implement encode and decode
 *
 * Example 1:
 *
 * Input: ["neet","code","love","you"]
 *
 * Output:["neet","code","love","you"]
 */
public class EncodeAndDecoder {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(getStringWithLengthPrepended(str));
        }
        return sb.toString();
    }

    private String getStringWithLengthPrepended(String str) {
        String stringWithLength = "" + str.length();
        switch (stringWithLength.length()) {
            case 1:
                stringWithLength = "00" + stringWithLength;
                break;
            case 2:
                stringWithLength = "0" + stringWithLength;
                break;
        }
        return stringWithLength + ":" + str;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        for ( int i = 0; i < str.length(); ) {
            String len = "";
            int j = 0;
            while (j < 3) {
                len += str.charAt(i + j);
                j++;
            }
            i = i + 4;
            ans.add(str.substring(i, i+ Integer.parseInt(len)));
            i = i + Integer.parseInt(len);
        }
        return ans;
    }
}

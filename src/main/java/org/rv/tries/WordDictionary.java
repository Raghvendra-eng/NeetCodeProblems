package org.rv.tries;


import java.util.HashMap;
import java.util.Map;

/**
 * Design a data structure that supports adding new words and searching for existing words.
 *
 * Implement the WordDictionary class:
 *
 * void addWord(word) Adds word to the data structure.
 * bool search(word) Returns true if there is any string
 * in the data structure that matches word or false otherwise.
 * word may contain dots '.' where dots can be matched with any letter.
 */
public class WordDictionary {
    Map<Character, Node> head;
    public WordDictionary() {
        head = new HashMap<>();
    }

    public void addWord(String word) {
        if (word.isEmpty())
            return;
        Node ptr = head.get(word.charAt(0));
        if (ptr == null){
            head.put(word.charAt(0), new Node());
            ptr = head.get(word.charAt(0));
        }
        for (int i = 1; i < word.length(); i++) {
            if (!ptr.child.containsKey(word.charAt(i))) {
                ptr.child.put(word.charAt(i), new Node());
            }
            ptr = ptr.child.get(word.charAt(i));
            if (i == (word.length() - 1))
                ptr.isEnd = true;
        }
    }

    private boolean searchHelper(String word, Node head) {
        if (word.isEmpty())
            return false;
        return false;
    }
    public boolean search(String word) {
        if (word.isEmpty())
            return false;
        Map<Character, Node> ptr = head;
        Map<Character, Node> prevPtr = null;
        for ( int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '.') {
                Boolean ans = false;
                for(Node node : ptr.values()) {
                    ans = ans || searchHelper(word.substring(i+1), node);
                }
                return ans;
            } else if (ptr.containsKey(word.charAt(i))){
                prevPtr = ptr;
                ptr = ptr.get(word.charAt(i)).child;
            } else {
                return false;
            }
        }
        return true;
    }

    private class Node {
        Map<Character, Node> child;
        Boolean isEnd;
        Node() {
            child = new HashMap<>();
            isEnd = false;
        }
        Node(Boolean isEnd) {
            child = new HashMap<>();
            this.isEnd = isEnd;
        }
    }
}

package org.rv.tries;

import java.util.HashMap;
import java.util.Map;

public class PrefixTree {
    Map<Character, TreeNode> heads;
    public PrefixTree() {
        heads = new HashMap<>();
    }

    public void insert(String word) {
        Map<Character,TreeNode> itr = heads;
        for ( int i = 0; i < word.length(); i++) {
            if (!itr.containsKey(word.charAt(i))) {
                itr.put(word.charAt(i), new TreeNode());
            }
            if (i == (word.length()-1)) {
                itr.get(word.charAt(i)).isEnd = true;
            }
            itr = itr.get(word.charAt(i)).childs;
        }
    }

    public boolean search(String word) {
        TreeNode itr = heads.get(word.charAt(0));
        if (itr == null)
            return false;
        for ( int i = 1; i < word.length(); i++) {
            if (itr.childs.containsKey(word.charAt(i))) {
                itr = itr.childs.get(word.charAt(i));
            } else {
                return false;
            }
        }
        return itr.isEnd;
    }

    public boolean startsWith(String prefix) {
        TreeNode itr = heads.get(prefix.charAt(0));
        if (itr == null)
            return false;

        for ( int i = 1; i < prefix.length(); i++) {
            if (itr.childs.containsKey(prefix.charAt(i))) {
                itr = itr.childs.get(prefix.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    private class TreeNode {
        Map<Character, TreeNode> childs;
        Boolean isEnd;
        TreeNode () {
            childs = new HashMap<>();
            isEnd = false;
        }
    }
}

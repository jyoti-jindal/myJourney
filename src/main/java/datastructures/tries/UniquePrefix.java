package datastructures.tries;

import java.util.HashMap;

public class UniquePrefix {

    public static void main(String[] args) {
        UniquePrefix uniquePrefix = new UniquePrefix();
        uniquePrefix.prefix(new String[]{"zebra", "dog", "duck", "dove"});
    }

    public String[] prefix(String[] A) {
        int n = A.length;
        String[] res = new String[n];
        Trie trie = new Trie(new TrieNode(new HashMap<Character, Pair>(), false));
        for (int i = 0; i < n; i++) {
            trie.insert(A[i]);
        }
//            TrieNode root = trie.root;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = trie.search(A[i]);
            res[i] = sb.toString();
        }
        return res;
    }


}

class TrieNode {
    HashMap<Character, Pair> children;
    boolean isEndOfWord;

    TrieNode(HashMap<Character, Pair> children, boolean isEndOfWord) {
        this.children = children;
        this.isEndOfWord = isEndOfWord;
    }
}

class Trie {
    TrieNode root;

    Trie(TrieNode root) {
        this.root = root;
    }

    public void insert(String s) {
        TrieNode cur = root;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!cur.children.containsKey(ch)) {
                cur.children.put(ch, new Pair(new TrieNode(new HashMap<Character, Pair>(), false), 1));
            } else {
                Pair p = cur.children.get(ch);
                p.count++;
            }
            cur = cur.children.get(ch).trieNode;
        }
        cur.isEndOfWord = true;
    }

    public StringBuilder search(String s) {
        TrieNode cur = root;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(ch);
            if (cur.children.get(ch).count > 1) {
                cur = cur.children.get(ch).trieNode;
            } else {
                break;
            }
        }
        return sb;
    }
}

class Pair {
    TrieNode trieNode;
    Integer count;

    Pair(TrieNode trieNode, Integer count) {
        this.trieNode = trieNode;
        this.count = count;
    }
}
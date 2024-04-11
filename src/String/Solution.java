package String;
import java.util.*;
public class Solution {

    //Longest Common Prefix
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    
    //Word Pattern
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }   
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];   
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (set.contains(word)) {
                    return false;
                }
                map.put(ch, word);
                set.add(word);
            }
        }
        return true;
    }
    
    //First Unique Char
    public int firstUniqChar(String s) {
    	HashMap<Character, Integer> charCount = new HashMap<>();
    	
    	for (char c : s.toCharArray()) {
    		charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		if(charCount.get(s.charAt(i)) == 1) {
    			return i;
    		}
    	}
    	
    	return -1;
    }
    
    //Robot Return to Origin
    public boolean judgeCircle(String moves) {
    	int x = 0 , y = 0;
    	
    	for(char move : moves.toCharArray()) {
    		if (move == 'U') {
    			y++;
    		}else if(move == 'D') {
    			y--;
    		}else if(move == 'L') {
    			x--;
    		}else if(move == 'R') {
    			x++;
    		}
    	}
    	
    	return x == 0 && y == 0;
    }
}